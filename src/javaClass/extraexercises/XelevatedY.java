package javaClass.extraexercises;

import javaClass.reuseFunctions.Function;

public class XelevatedY {

    public static void main(String[] args) {
        while (true) {

            int x = Function.readNumber("insert X");
            int y = Function.readNumber("insert Y");
            int count = 1;
            int total = 0;
            int soma = x;

            while (count < y) {
                for (int i = 0; i < x; i++) {
                    total += soma;
                }
                soma = total;
                total = 0;

                count++;
            }

            System.out.println(soma);
        }
    }

}

/*
 * x needs to be multiply by x as many times y
 * read x
 * read y
 * 
 * while (count < y)
 * got
 * 
 */
