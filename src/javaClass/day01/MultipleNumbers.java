/*
 * start
 *  read N 
 *  read M
 *  result 0
 *  counting 0
 *  while counting>N
 *      result = result + M
 *      counting++
 *  end while
 *  prfloat result
 * end
 * 
 * 
 *  
 */
package javaClass.day01;

import java.util.Scanner;

public class MultipleNumbers {
    
    public static void main(String[] args) {
        while (true){
            Scanner reader = new Scanner(System.in);
            System.out.println("give me an number");
            float x = reader.nextFloat();
            System.out.println("give me an number");
            float y = reader.nextFloat();
            float count = 0;
            float result = 0;
    
            while (count < x){
                result += y;
                count++;
            }

            System.out.println("the multiple of the numbers is : " + result);
        }
       
    }
}
