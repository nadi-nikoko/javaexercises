package javaClass.reuseFunctions;

import java.util.Scanner;

public class FunctionText {
    
    public static String readString(String msg) {
    System.out.println(msg);
    Scanner reader = new Scanner(System.in);
    String n = reader.nextLine();
    return n;
    }

    public static String readString() {
        return readString("Insert a word");
    }
}

