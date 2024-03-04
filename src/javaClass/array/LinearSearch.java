package javaClass.array;

import java.util.Objects;

public class LinearSearch {
    public static void main(String[] args) {

        int array[] = { 1, 2, 3, 4, 5 };
        System.out.println(linearSearch(array, 6));
    }

    public static int linearSearch(int[] data, int key) {
        data = Objects.requireNonNullElse(null, new int[0]);
        int result = -1;
        for (int dt : data) {
            if (dt == key)
                result = key;
        }
        return result;
    }
}
