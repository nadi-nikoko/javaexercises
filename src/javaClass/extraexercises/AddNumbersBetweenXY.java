package javaClass.extraexercises;

import javaClass.reuseFunctions.Function;

public class AddNumbersBetweenXY {
    public static void main(String[] args) {
        while(true){
        int x = Function.readNumber();
        int y = Function.readNumber();
        int higher = 0;
        int smaller = 0;
        int result = 0;
        if (x <= y){
             higher = y;
             smaller = x;
        }
        if (x > y){
             higher = x;
             smaller = y;
         }
         while (smaller <= higher){
            result += smaller;
            smaller++;
         }
         System.out.println("if you add all numbers between " + x + " and " + y +" the result is " + result);
    
    }   
}
}
