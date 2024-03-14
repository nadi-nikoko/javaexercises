package javaClass.extraexercises.throwErrorsExercises;

import java.util.Scanner;

public class SimpleCatchTry {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("give me a number");
        try {
            int x = reader.nextInt();
            System.out.println(x);
        } catch (Exception e) {
            System.out.println("error, its need a number");
        }
    }
}
