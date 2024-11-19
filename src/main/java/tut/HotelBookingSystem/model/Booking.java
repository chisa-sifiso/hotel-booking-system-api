package tut.HotelBookingSystem.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String guestName;
    private String roomType;
    private int nights;
    private double totalCost;
    public Booking(String guestName, String roomtype, int nights, double totalCost) {
        this.guestName = guestName;
        this.roomType = roomtype;
        this.nights = nights;
        this.totalCost = totalCost;
    }

}
