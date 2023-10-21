import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

public class Reservation {
    private String reservationId;
    private Customer customer;
    private Room room;
    private LocalDate checkInDate;
    private LocalDate checkoutDate;
    private Set<String> reservationIds = new HashSet<>();

    public Reservation(Customer customer, Room room, LocalDate checkInDate, LocalDate checkoutDate) {
        this.customer = customer;
        this.room = room;
        this.checkInDate = checkInDate;
        this.checkoutDate = checkoutDate;
    }

    private String generateUniqueReservationID(){
        String newReservationId;
        do{
            newReservationId = UUID.randomUUID().toString();
        }
       while(reservationIds.contains(newReservationId));
       reservationIds.add(newReservationId);
       return newReservationId;
    }

    public String getReservationId() {
        return reservationId;
    }

    public void setReservationId() {
        this.reservationId = generateUniqueReservationID();
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "customer=" + customer.getCustomerInfo() +
                ", room=" + room.getRoomNumber() +
                ", checkInDate=" + checkInDate +
                ", checkoutDate=" + checkoutDate +
                '}';
    }
}
