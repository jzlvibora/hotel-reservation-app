import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String firstName;
    private String lastName;
    private String birthdate;
    private String contactNumber;
    List<Reservation> reservations = new ArrayList<>();

    public Customer(String firstName, String lastName, String birthdate, String contactNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthdate = birthdate;
        this.contactNumber = contactNumber;
    }

    public void makeReservation(Room room, LocalDate checkInDate, LocalDate checkOutDate){
        room.setAvailable(false);
        Reservation newReservation = new Reservation(this,room,checkInDate,checkOutDate);
        newReservation.setReservationId();
        System.out.println(newReservation);
        reservations.add(newReservation);
        System.out.println("Successfully booked room " + room.getRoomNumber());
        System.out.println("Total : " + room.getNightlyRate() );
    }

    public String getCustomerInfo(){
        return firstName + " " + lastName;
    }

    public void viewReservations(){
        for(Reservation reservation:reservations){
            reservation.toString();
        }
    }
}
