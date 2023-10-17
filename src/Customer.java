public class Customer {
    private String firstName;
    private String lastName;
    private String birthdate;
    private String contactNumber;

    public Customer(String firstName, String lastName, String birthdate, String contactNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthdate = birthdate;
        this.contactNumber = contactNumber;
    }

    public void makeReservation(Room room, String checkInDate, String checkOutDate){
        room.setAvailable(false);
        System.out.println("Successfully booked room " + room.getRoomNumber());
        System.out.println("Total : " + room.getPrice() );
    }
}
