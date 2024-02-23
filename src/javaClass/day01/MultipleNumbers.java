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

import javaClass.reuseFunctions.Function;

public class MultipleNumbers {
    
    public static void main(String[] args) {
        while (true){
            float x = Function.readNumber("insert an integer");
            float y = Function.readNumber("insert an integer");
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
