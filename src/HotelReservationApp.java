import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class HotelReservationApp {
    public static void main(String[] args) {

        Hotel hotelA = new Hotel();
        Room room101 = new Room(101, RoomType.SINGLE, true, 2000, 1);
        Room room102 = new Room(102, RoomType.SINGLE, true, 2500, 1);
        Room room103 = new Room(103, RoomType.DOUBLE, true, 3000, 2);
        Room room104 = new Room(104, RoomType.SUITE, true, 5000, 5);
        Room[] rooms = {room101, room102, room103, room104};
        hotelA.setRooms(List.of(rooms));
        Customer customer1 = new Customer("Ash", "Lynx", "2002-01-01", "0900987685");


        Scanner scanner = new Scanner(System.in);
        int choice = -1;
        while (choice != 3) {
            displayMenu();
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Showing all rooms...");
                        showAllRooms(hotelA);
                        break;
                    case 2:
                        System.out.println("Reserve a room");
                        reserveARoom(customer1,room104);
                        break;
                    case 3:
                        System.out.println("Exit");
                        break;
                    default:
                        System.out.println("Invalid option");
                        break;
                }
            }

        else{
            System.out.println("Invalid input");
            scanner.next();
        }
    }



        }

        private static void displayMenu(){
            System.out.println("*************MAIN MENU************ \n " +
                    "----------------------------------- \n" +
                    "1. List of rooms \n" +
                    "2. Reserve a room \n" +
                    "3. Exit \n" +
                    "------------------------------------ \n" +
                    "************************************ \n " +
                    "Please select a number for the menu option."
            );
        }

        private static void showAllRooms(Hotel hotel){
            hotel.displayAllRooms();
        }

        private static void reserveARoom(Customer customer, Room room){
        customer.makeReservation(room, LocalDate.of(2023,10,20), LocalDate.of(2023,10,23));


        }


    }
