/*
 * stampare la somma dei numero prime entre 0 and N
 * start
 *  read N
 *  count 0
 *  while count<N
 *      print N
 *      count + 2
 *  end while
 */

package javaClass.day01;

import javaClass.reuseFunctions.Function;

public class PrintPrimes {

    public static void main(String[] args) {
        int count = 0;
        int n = Function.readNumber("insert an integer");
        System.out.println("the even numbers primes");

        while (count <= n) {
            if (Function.isPrime(count))
                System.out.print(count + " ");
            count++;
        }
        /*
         * while (count<= n){
         * System.out.print(count + " ");
         * count += 2;
         * }
         */
    }

}
