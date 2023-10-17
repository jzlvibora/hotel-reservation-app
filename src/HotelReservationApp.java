import java.util.List;

public class HotelReservationApp {
    public static void main(String[] args) {

        Hotel hotelA = new Hotel();
        Room room101 = new Room(101,"Single", true, 2000);
        Room room102 = new Room(102,"Double", true, 2500);
        Room room103 = new Room(103,"Deluxe", true, 3000);
        Room room104 = new Room(104,"Royal", true, 5000);
        Room[] rooms = {room101,room102,room103,room104};
        hotelA.setRooms(List.of(rooms));
        Customer customer1 = new Customer("Ash", "Lynx", "2002-01-01", "0900987685");
        hotelA.displayAllRooms();
        customer1.makeReservation(room101,"2023-10-17", "2023-10-20");
        hotelA.displayAvailableRooms();



        }
    }
