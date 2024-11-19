package tut.HotelBookingSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tut.HotelBookingSystem.model.Booking;

@Repository
public interface BookingRepository extends JpaRepository<Booking,Long> {
}
