/*
 * stampare la somma dei numero pari entre 0 and N
 * start
 *  read N
 *  count 0
 *  while count<N
 *      print N
 *      count + 2
 *  end while
 */

package javaClass.day01;

import java.util.Scanner;

public class PrintEvens {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int count = 0;
        System.out.println("give me an integer");
        int N = reader.nextInt();
        System.out.println("the even numbers are");
        while (count<= N){
            System.out.print(count + " ");
            count += 2;
        }
    }
    
}
