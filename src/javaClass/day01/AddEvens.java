/*
 * stampare la somma dei numero pari entre 0 and N
 * 
 * start
 *  read N
 *  count 0
 *  result 0
 *  while count<N
 *      print N
 *      result += count
 *      count + 2
 *  end while
 */
package javaClass.day01;

import java.util.Scanner;

public class AddEvens {
public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    int count = 0;
    System.out.println("give me an integer");
    int N = reader.nextInt();
    System.out.println("the primos numbers are");
    int result = 0;

    /*
    while (count<= N){
        System.out.print(count + " ");
        result = result + count;
        count += 2;
    }
    */
    boolean isPar = true;
    while (count<=N){
        if (isPar){
            result = result + count;
            System.out.println(count);
            isPar= false;
       } else isPar=true;
       count ++;
    }


    System.out.println("\nthe add of all primos is: " + result);
    }
}
