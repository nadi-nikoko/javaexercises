package javaClass.array;

import java.util.Objects;

public class ArrayTools {

    public static void LinearSequence(int data[], int a, int b) {

        for (int i = 0; i < data.length; i++) {

            data[i] = b + (i * a);
        }
    }

    // What function call would you make to fill data with N, N-1, N-2, ..., 3, 2, 1
    // where N is the length of the array data?

    public static void LinearSequence(int data[]) {
        for (int i = 0; i < data.length; i++) {
            data[i] = data.length - i;
        }
    }

    public static void stampa(int[] arr) {
        Objects.requireNonNull(arr);
        for (int i = 0; i < arr.length; i++) {
            if (i == (arr.length - 1))
                System.out.println(arr[i] + ".");
            else
                System.out.print(arr[i] + ", ");
        }

    }

}