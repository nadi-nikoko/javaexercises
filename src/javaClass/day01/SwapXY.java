package javaClass.day01;

import javaClass.reuseFunctions.Function;

public class SwapXY {
 
    public static void main (String[] args){
        int x = Function.readNumber("insert an integer (X)");
        int y = Function.readNumber("insert an integer (Y)");
        int z;
        z = x;
        x = y;
        y = z;
        System.out.println("y eh "+y);
        System.out.println("x eh "+x);
    }

    
}
