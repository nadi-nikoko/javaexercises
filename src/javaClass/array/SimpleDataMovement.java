package javaClass.array;

import java.util.Scanner;

public class SimpleDataMovement {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("write the numbers of your array separeted by coma (ex: 1,2,3,4)");
        String[] text = reader.nextLine().split(",");
        int[] data = new int[text.length];

        for (int i = 0; i < data.length; i++) {
            data[i] = Integer.parseInt(text[i]);
        }

        for (int number : data) {
            System.out.println(number);
        }

        // int data[] = { 1, 2, 3, 4, 5, 6 };
        ArrayTools.stampa(data);

        while (true) {
            Scanner reader2 = new Scanner(System.in);
            System.out.println("[A] ROTATE LEFT [S] REVERSE [D] ROTATE RIGHT [E] EXIT");
            String menu = reader2.nextLine().toUpperCase().trim();

            switch (menu) {
                case "A":
                    RotateLeft(data);
                    break;
                case "S":
                    Reverse(data);
                    break;
                case "D":
                    RotateRight(data);
                    break;
                case "E":
                    return;
                default:
                    break;
            }
            ArrayTools.stampa(data);
        }
    }

    private static void Reverse(int[] data) {
        int x = 0;
        x = data[0];
        data[0] = data[(data.length - 1)];
        data[data.length - 1] = x;
    }

    public static void RotateLeft(int[] data) {
        int[] neoArray = new int[data.length];
        for (int i = 0; i < data.length; i++) {
            if (i == (data.length - 1))
                neoArray[i] = data[0];
            else
                neoArray[i] = data[i + 1];
        }
        for (int i = 0; i < neoArray.length; i++) {
            data[i] = neoArray[i];
        }
    }

    public static void RotateRight(int[] data) {
        int[] neoArray = new int[data.length];
        for (int i = 0; i < data.length; i++) {
            if (i == (data.length - 1))
                neoArray[0] = data[data.length - 1];
            else
                neoArray[(i + 1)] = data[i];
        }
        for (int i = 0; i < neoArray.length; i++) {
            data[i] = neoArray[i];
        }
    }
}
