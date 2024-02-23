package javaClass.day01;

import java.util.Scanner;

public class SwapXY {
 
    public static void main (String[] args){
        Scanner reader = new Scanner(System.in);
        System.out.println("insert X");
        int x = reader.nextInt();
        System.out.println("insert y");
        int y = reader.nextInt();
        int z;
        z = x;
        x = y;
        y = z;
        System.out.println("y eh "+y);
        System.out.println("x eh "+x);
    }

    
}
