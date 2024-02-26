/* 
 *check the palidron
 while() 
*/
package javaClass.extraexercises;

import java.util.Scanner;

public class IsItaPalindron {
    public static void main(String[] args) {
        while(true){
        Scanner reader = new Scanner (System.in);
        System.out.println("give me a word");
        String word = reader.nextLine();
        String invertedWord = "";
        for (int i= word.length() - 1; i>=0; i--){
            invertedWord += word.charAt(i);
        }
        System.out.println(word + " inverted is " +invertedWord);

        if (word.equals(invertedWord)){
            System.out.println("its a palidron");
        } else System.out.println("its not a palidron"); 
    }
}
}
