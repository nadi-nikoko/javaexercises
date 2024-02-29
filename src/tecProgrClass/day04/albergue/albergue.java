package tecProgrClass.day04.albergue;

import java.lang.reflect.Array;
import java.util.Scanner;

public class albergue {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Scanner readerTxt = new Scanner(System.in);
        System.out.println("how many rooms the albergue has?");
        int rooms[] = new int[(reader.nextInt())];

        while (true) {
            System.out.println("what can i help you?");
            System.out.println("[C] check rooms available");
            System.out.println("[P] pick a room available");
            System.out.println("[CO] check out room");
            System.out.println("[O] show albergue occupation");
            System.out.println("[E] exit");
            String menu = readerTxt.nextLine().toUpperCase().trim();

            switch (menu) {
                case "C":
                    System.out.println(CheckRooms(rooms));
                    break;

                case "P":
                    PickRoom(rooms);
                    break;

                case "CO":
                    CheckOut(rooms);
                    break;

                case "O":
                    AlbergueOccupation(rooms);
                    break;

                case "E":
                    break;
                default:
                    break;
            }
        }
    }

    private static void CheckOut(int[] rooms) {
        Scanner reader = new Scanner(System.in);
        System.out.println("in which room where you staying?");
        int checkRoom = reader.nextInt();
        rooms[checkRoom + 1] = 0;
        System.out.println("checkout succeded");
    }

    private static void AlbergueOccupation(int[] rooms) {
        int freeRooms = 0;
        int index = 1;
        int totalPeople = 0;
        for (int room : rooms) {
            if (room == 0) {
                System.out.println("the room " + index + " is empty");
                freeRooms++;
            } else
                totalPeople += rooms[index - 1];
            index++;
        }
        System.out.println("there are " + totalPeople + " staying at the albergue and we have " + freeRooms);
    }

    private static void PickRoom(int rooms[]) {
        int index = 1;
        boolean available = false;
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i] == 0 && !available) {
                Scanner reader = new Scanner(System.in);
                System.out.println("how many people are you?");
                int numberPeople = reader.nextInt();
                rooms[i] = numberPeople;
                System.out.println("the room number " + index + " its available for you");
                available = true;
            }
            index++;
        }
    }

    private static int CheckRooms(int rooms[]) {
        int freeRooms = 0;
        int index = 1;
        for (int room : rooms) {
            if (room == 0) {
                System.out.println("room number " + index + " is available");
                freeRooms++;
            }
            index++;
        }
        System.out.println("----- we have " + freeRooms + " rooms available ------");
        return freeRooms;
    }
}
