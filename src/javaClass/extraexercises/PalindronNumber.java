package javaClass.extraexercises;

import javaClass.reuseFunctions.Function;

public class PalindronNumber {
    public static void main(String[] args) {
        while (true) {
            int x = Function.readNumber();
            boolean boo = true;
            String value = String.valueOf(x);
            String invertedValue = "";
            if (x < 0) {
                boo = false;
            }
            for (int i = value.length() - 1; i >= 0; i--) {
                invertedValue += value.charAt(i);
            }
            if (invertedValue.equals(value))
                boo = true;
            else
                boo = false;

            System.out.println("is it " + x + " a palidron number? " + boo);
        }
    }

}
