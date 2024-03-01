package javaClass.array;

public class teste {
    public static void main(String[] args) {
        int numbers[] = { 1, 2, 3, 4, 5, 6 };
        int numbers2[] = new int[1];
        numbers2 = numbers;

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers2[i]);
        }

        System.out.println("space between method");

        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
