//Write a Java program to implement a lambda expression to check if a given string is empty.

package javaClass.ObjectedOriented.lambaExpressions;

public class ex03 {
    public static void main(String[] args) {

        String[] upper = { "AAAA", "BBBBB", "CCCCCC" };

        lowerCase l = (a -> a.toLowerCase());

        for (String u : upper) {
            System.out.println(l.lower(u));
        }

    }
}

interface lowerCase {
    public String lower(String upper);
}
