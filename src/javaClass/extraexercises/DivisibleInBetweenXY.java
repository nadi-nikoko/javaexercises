package javaClass.extraexercises;

import javaClass.reuseFunctions.Function;

public class DivisibleInBetweenXY {
    public static void main(String[] args) {
        while(true){
       int x = Function.readNumber();
       int y = Function.readNumber();
       int higher = 0;
       int smaller = 0;
       if (x <= y){
            higher = y;
            smaller = x;
       }
       if (x > y){
            higher = x;
            smaller = y;
        }

        //start counting from 0, and see all integer numbers that multiple by smaller are still smaller than the higher value
        for (int i= 0; i<higher; i++){
            int result = smaller * i;
            if ((result) <= higher ){
                System.out.println(result);
            }
        }
    }
}
}
