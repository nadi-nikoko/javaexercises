//Write a Java program to implement a lambda expression to find the sum of two integers.

package javaClass.ObjectedOriented.lambaExpressions;

public class ex01 {
    public static void main(String[] args) {
        SumCalculator add = (a, b) -> (a + b);
        SumCalculator sub = (a, b) -> (a - b);
        SumCalculator mult = (a, b) -> (a * b);
        System.out.println(add.sum(10, 20));
        System.out.println(sub.sum(10, 20));
        System.out.println(mult.sum(10, 20));
    }
}

interface SumCalculator {
    public int sum(int a, int b);
}