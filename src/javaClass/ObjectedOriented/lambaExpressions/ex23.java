// Write a Java program to implement a lambda expression to find the average length of strings in a list.

package javaClass.ObjectedOriented.lambaExpressions;

import java.util.function.Predicate;

public class ex23 {
    public static void main(String[] args) {

        String[] words = { "palavra", "poesia", "arte", "poeta", "umapalavragigante" };

        counting c = (Stringlist) -> {
            double countWords = 0;
            double countLength = 0;
            for (String x : Stringlist) {
                countLength = x.length();
                countWords++;
            }
            return countLength / countWords;
        };

        System.out.println(c.count(words));
    }

}

interface counting {
    public double count(String[] x);
}