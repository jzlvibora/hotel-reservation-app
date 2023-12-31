import java.util.List;

public class Hotel {
    private String name;
    private List<Room> rooms;

    public Hotel() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }

    public void displayAllRooms(){
        for(Room room: rooms) {
            room.displayRoomDetails();
        }
    }

    public void displayAvailableRooms(){
        for(Room room: rooms){
            if(room.isAvailable()){
                room.displayRoomDetails();
            }

        }

    }
}
