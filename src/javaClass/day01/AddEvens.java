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

import javaClass.reuseFunctions.Function;

public class AddEvens {
public static void main(String[] args) {
    int count = 0;
    int N = Function.readNumber("insert an integer");
    System.out.println("the even numbers are");
    int result = 0;

    
    while (count<= N){
        System.out.print(count + " ");
        result = result + count;
        count += 2;
    }

    /* or with boolean 

    boolean isPar = true;
    while (count<=N){
        if (isPar){
            result = result + count;
            System.out.print(count + " ");
            isPar= false;
       } else isPar=true;
       count ++;
    }
    */


    System.out.println("\nthe add of all primos is: " + result);
    }
    
}

