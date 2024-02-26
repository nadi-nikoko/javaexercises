package javaClass.extraexercises;

import javaClass.reuseFunctions.Function;

public class TheRest {
    public static void main(String[] args) {
    int x = Function.readNumber();
    int y = Function.readNumber();
    int higher = 0;
    int smaller = 0;
    int result = 0;
    int count = -1;
    int left = 0;
    if (x <= y){
        higher = y;
        smaller = x;
    }
    if (x > y){
        higher = x;
        smaller = y;
    }
    for (int i=0; i<higher; i++){
        if (result < higher){
            left = higher - result;
            result += smaller;
            count++;
        }
    }
    System.out.println("it has multiple " + count + " times and it had " + left + " left");
}
}
