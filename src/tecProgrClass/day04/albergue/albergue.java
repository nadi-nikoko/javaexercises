package tecProgrClass.day04.albergue;

import java.util.Scanner;

public class albergue {
    public static void main(String[] args) {

        Scanner readerTxt = new Scanner(System.in);
        System.out.println("how many rooms the albergue has?");
        int rooms[] = new int[NumberErrorCatcher()];

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
        System.out.println("in which room where you staying?");
        int checkRoom = NumberErrorCatcher();
        if (checkRoom > 0) {
            if (rooms[(checkRoom - 1)] == 0) {
                System.out.println("the room is already empty");
            } else {
                rooms[checkRoom - 1] = 0;
                System.out.println("checkout succeded");
            }
        } else
            System.out.println("this room doesnt exist");

    }

    private static void AlbergueOccupation(int[] rooms) {
        int freeRooms = 0;
        int index = 1;
        int totalPeople = 0;
        for (int room : rooms) {
            if (room == 0) {
                System.out.println("the room " + index + " is empty");
                freeRooms++;
            } else {
                totalPeople += rooms[index - 1];
                System.out.println("the room " + index + " is occupied with " + rooms[index - 1] + " guests.");
            }
            index++;
        }
        System.out.println(
                "there are " + totalPeople + " staying at the albergue and we have " + freeRooms + " free rooms");
    }

    private static void PickRoom(int rooms[]) {
        int index = 1;
        boolean available = false;
        boolean roomsAvailability = false;
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i] == 0) {
                System.out.println("room number " + (i + 1) + " is available");
                roomsAvailability = true;
            }

        }
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i] == 0 && !available) {
                System.out.println("which room would like to take?");
                int number = NumberErrorCatcher();
                int numberRoom = rooms[number - 1];
                if (numberRoom == 0) {
                    System.out.println("how many people are you?");
                    int numberPeople = NumberErrorCatcher();
                    rooms[number - 1] = numberPeople;
                    System.out.println("the room number " + index + " is available for you");
                    available = true;
                } else
                    System.out.println("room not available");
            }
            index++;
        }
        if (!roomsAvailability) {
            System.out.println("we dont have any room available");
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

    private static int NumberErrorCatcher() {
        Scanner reader = new Scanner(System.in);
        int x = 0;

        while (true) {
            try {
                x = reader.nextInt();
                break;

            } catch (Exception e) {
                System.out.println("try again, wrong input, its only allowed numbers (ex:1,2,3)");
                reader.nextLine();
            }
        }
        return x;
    }
}
