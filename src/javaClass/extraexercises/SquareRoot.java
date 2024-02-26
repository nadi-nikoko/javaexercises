package javaClass.extraexercises;

import javaClass.reuseFunctions.Function;

public class SquareRoot {
        public static void main(String[] args){
            while(true){
            int x = Function.readNumber();
            boolean squareRoot = false;
            for (int i = 0; i < x; i++){
                int result = i * i;
                if (result == x){
                    System.out.println("the square root of " + x + " is " + i);
                    squareRoot = true;
                }
            }
            if (!squareRoot){
                System.out.println(x + " has no squareRoot");
            }
        }
        }
    
}
