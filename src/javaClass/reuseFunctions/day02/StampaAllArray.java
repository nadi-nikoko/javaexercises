package javaClass.reuseFunctions.day02;

public class StampaAllArray {
    public static void main(String[] args) {
        int array[] = { 1, 2, 3, 4, 5 };
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        int array2[] = { 1, 2, 3, 4, 5 };
        for (int i = array2.length - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }
    }
}
