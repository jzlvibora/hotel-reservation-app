public class Room {
    private int roomNumber;
    private String type;
    private boolean isAvailable;
    private double price;

    public Room(int roomNumber, String type, boolean isAvailable, double price) {
        this.roomNumber = roomNumber;
        this.type = type;
        this.isAvailable = isAvailable;
        this.price = price;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public void displayRoomDetails(){
        System.out.println("==========================");
        System.out.println("Room Number: " + roomNumber);
        System.out.println("Type: " + type);
        System.out.println("Availability: " + (isAvailable? "Available" : "Occupied"));
        System.out.println("Price: " + price);
        System.out.println("==========================");
    }
}
