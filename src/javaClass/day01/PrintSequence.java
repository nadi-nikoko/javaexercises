/*
inizio
    read N
    res = 0;
    while (res<=N) do
        print res
        res ++
    end while
end



*/
package javaClass.day01;

import javaClass.reuseFunctions.Function;

public class PrintSequence {
 
    public static void main (String[] args){
        while(true){
            // ask for a numbber and storage it to an integer;
            int numberInput = Function.readNumber("insert an integer");
            LeggiN(numberInput);
        }
    }

    public static void LeggiN(int num){
        int n = num;
        int x = 0;
        // create a counting integer and start printing all numbers between zero and int numberInput;
        while (x<=num){
            System.out.print(x + " ");
            x++;
        }
        System.out.println();

    }
}
