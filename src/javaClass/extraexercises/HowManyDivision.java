package javaClass.extraexercises;

import javaClass.reuseFunctions.Function;

public class HowManyDivision {
    public static void main(String[] args) {

        int x = Function.readNumber();
        int divisor = 0;

        for (int i = 1; i <= x; i++) {
            if (x % i == 0) {
                divisor++;
            }
        }
        System.out.println(divisor);
    }
}
