package tecProgrClass.day06;

import java.util.ArrayList;

public class Room {

    private String roomNumber;
    private int capacity;
    private String description;
    private ArrayList<Guest> listGuests;

    public Room(String roomNumber, int capacity, String description) {
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.description = description;
        listGuests = new ArrayList<Guest>();
    }

    public void addGuest(Guest newGuest) {
        if (listGuests.size() < capacity) {
            listGuests.add(newGuest);
            System.out.println("your bed is ready for you");
        } else
            System.out.println("room is full");
    }

    /**
     * metodo to know if there is room or not
     * 
     * @return it returns if there is space or not in the room
     */
    public boolean isFree() {
        boolean res = false;
        if (listGuests.size() == 0)
            res = true;
        return res;
    }

    /**
     * check the capacity available
     * 
     * @param num int that defines how many people u want in the room
     * @return if there is space or nor
     */
    public boolean isAvailablefor(int num) {
        boolean res = false;
        if (isFree() && num <= capacity)
            res = true;
        return res;
    }

    public int getNumberGuests() {
        int res = 0;
        for (int i = 0; i < listGuests.size(); i++) {
            res = listGuests.size();
        }
        return res;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ArrayList<Guest> getListGuests() {
        return listGuests;
    }

}
