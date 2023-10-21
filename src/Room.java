import java.util.List;

public class Room {
    private int roomNumber;
    private RoomType roomType;
    private boolean isAvailable;
    private double nightlyRate;
    private List<Amenities> amenities;
    private int maxOccupancy;

    public Room(int roomNumber, RoomType roomType, boolean isAvailable, double nightlyRate, int maxOccupancy) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.isAvailable = isAvailable;
        this.nightlyRate = nightlyRate;
//        this.amenities = amenities;
        this.maxOccupancy = maxOccupancy;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public void setRoomType(RoomType roomType) {
        this.roomType = roomType;
    }

    public double getNightlyRate() {
        return nightlyRate;
    }

    public void setNightlyRate(double nightlyRate) {
        this.nightlyRate = nightlyRate;
    }

    public List<Amenities> getAmenities() {
        return amenities;
    }

    public void setAmenities(List<Amenities> amenities) {
        this.amenities = amenities;
    }

    public int getMaxOccupancy() {
        return maxOccupancy;
    }

    public void setMaxOccupancy(int maxOccupancy) {
        this.maxOccupancy = maxOccupancy;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
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
        System.out.println("Type: " + roomType);
        System.out.println("Availability: " + (isAvailable? "Available" : "Occupied"));
        System.out.println("NightlyRate: " + nightlyRate);
        System.out.println("==========================");
    }
}
