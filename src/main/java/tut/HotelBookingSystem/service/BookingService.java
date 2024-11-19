package tut.HotelBookingSystem.service;


import org.springframework.stereotype.Service;
import tut.HotelBookingSystem.model.Booking;
import tut.HotelBookingSystem.repository.BookingRepository;

import java.util.List;

@Service
public class BookingService {
    private final BookingRepository bookingRepository;

    public BookingService(BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }

    public List<Booking> getAllBookings() {
        return bookingRepository.findAll();
    }


    public Booking getBookingById(Long id) {
        return bookingRepository.findById(id).orElseThrow(() -> new RuntimeException("Booking not found!"));
    }

    public Booking createBooking(Booking booking) {
        return bookingRepository.save(booking);
    }


    public Booking updateBooking(Long id, Booking updatedBooking) {
        Booking existingBooking = getBookingById(id);
        existingBooking.setGuestName(updatedBooking.getGuestName());
        existingBooking.setRoomType(updatedBooking.getRoomType());
        existingBooking.setNights(updatedBooking.getNights());
        existingBooking.setTotalCost(updatedBooking.getTotalCost());
        return bookingRepository.save(existingBooking);
    }

    public void deleteBooking(Long id) {
        bookingRepository.deleteById(id);
    }

}
