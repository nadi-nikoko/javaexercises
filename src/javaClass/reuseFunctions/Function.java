package javaClass.reuseFunctions;

import java.util.Scanner;

public class Function {

    public static int readNumber(String msg) {
    System.out.println(msg);
    Scanner reader = new Scanner(System.in);
    int n = reader.nextInt();
    return n;
    }

    public static int readNumber() {
        return readNumber("Insert a number");
    }

    public static boolean isPrime (int numero){
        if (numero <= 1)
            return false;
        int count = 2;
        while(count < numero){
            if (numero % count == 0)
                return false;
        count++;
        }
    return true;
    }
}

