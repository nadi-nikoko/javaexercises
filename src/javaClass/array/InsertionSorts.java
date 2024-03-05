package javaClass.array;

public class InsertionSorts {

    public static void main(String[] args) {
        int x[] = { 3, 5, 2, 8, 1 };
        int y[] = insertionSort(x);

        for (int of : y) {
            System.out.println(of);
        }

    }

    public static int[] insertionSort(int[] list) {

        for (int i = 0; i < list.length; i++) {
            int key = list[i];
            int j = i - 1;
            while (j >= 0 && list[j] > key) {
                list[j + 1] = list[j];
                j = j - 1;
            }
            list[j + 1] = key;

        }
        return list;
    }
}
