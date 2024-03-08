package tecProgrClass.day06;

import java.util.ArrayList;
import java.util.Scanner;

public class Albergo {

    static ArrayList<Room> listRooms = new ArrayList<Room>();

    public static void main(String[] args) {

        System.out.println("");
        Room newRoom;
        newRoom = new Room("101", 3, "vista mar piu hidromassage");
        listRooms.add(newRoom);
        newRoom = new Room("102", 2, "king size bed");
        listRooms.add(newRoom);
        while (true) {
            Scanner reader = new Scanner(System.in);
            System.out.println("C to check in");
            System.out.println("R to rooms availble");
            System.out.println("T  to total guests");
            System.out.println("CO  to check out");
            String menu = reader.nextLine().toUpperCase().trim();
            if (menu.equals("C")) {
                checkIn();
            }
            if (menu.equals("R")) {
                System.out.println("there is " + getRoomsAvailable() + " room available");
            }
            if (menu.equals("T")) {
                System.out.println("there are " + getTotGuests() + " guests atm");
            }
            if (menu.equals("CO")) {
                checkOut();
            }

        }

    }

    static void checkIn() {
        Scanner reader = new Scanner(System.in);
        Scanner readerNum = new Scanner(System.in);
        // collect data of client
        System.out.println("Ciao, whats your first name?");
        String firstName = reader.nextLine();
        System.out.println("second name");
        String lastName = reader.nextLine();
        System.out.println("how many are you?");
        int numberOfGuests = readerNum.nextInt();
        Guest newGuest;
        // add client to the system
        newGuest = new Guest(firstName, lastName);
        int index = -1;
        String chiave = "not available";
        for (int i = 0; i < listRooms.size(); i++) {
            boolean available = listRooms.get(i).isAvailablefor(numberOfGuests);
            if (available) {
                chiave = listRooms.get(i).getRoomNumber();
                System.out.println("your room is " + chiave);
                index = i;
                break;
            }
            if (chiave.equals("not available")) {
                System.out.println(chiave);
                return;
            }
        }
        // Check the number of guests and add it to the room
        for (int i = 0; i < numberOfGuests; i++)
            listRooms.get(index).addGuest(newGuest);
    }

    static void checkOut() {
        Scanner reader = new Scanner(System.in);
        System.out.println("welcome to check out, which room were you in?");
        String room = reader.nextLine().trim();
        for (int i = 0; i < listRooms.size(); i++) {
            if (room.equals(listRooms.get(i).getRoomNumber())) {
                listRooms.clear();
                System.out.println("check out done");
            }
        }

    }

    static int getRoomsAvailable() {
        int freeRoom = 0;
        for (int i = 0; i < listRooms.size(); i++) {
            if (listRooms.get(i).isFree())
                freeRoom++;
        }
        return freeRoom;

    }

    static int getTotGuests() {
        int total = 0;
        for (Room room : listRooms) {
            total += room.getNumberGuests();
        }
        return total;
    }
}
// class guest
// class room
