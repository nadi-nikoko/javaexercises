package javaClass.array;

public class SelectionSort {
    public static void main(String[] args) {
        int[] x = { 10, 3, 8, 56, 2, 5, 7 };
        selectionSort(x);
        for (int value : x) {
            System.out.println(value);
        }
    }

    private static void selectionSort(int[] list) {
        for (int i = 0; i < list.length; i++) {
            int min = list[i];
            int index = i;
            int j = i + 1;
            while (j < list.length) {
                if (min > list[j]) {
                    min = list[j];
                    index = j;
                }
                j++;
            }
            list[index] = list[i];
            list[i] = min;
        }

    }
}
