/*
inizio
    read N
    res = 0;
    soma = 0;
    while (res<=N) do
        soma = soma + res
        res ++
    end while
    print soma;
end



*/
package javaClass.day01;

import java.util.Scanner;

public class CountSequence {
 
    public static void main (String[] args){
        Scanner reader = new Scanner(System.in);
        while(true){
            // ask for a numbber and storage it to an integer;
            System.out.println("give me a integer number");
            int numberInput = reader.nextInt();
            LeggiN(numberInput);
        }
    }

    public static void LeggiN(int num){
        int n = num;
        int x = 0;
        int soma = 0;
        // create a loop for count the numbers and increment their value on soma variable
        while (x<=num){
            soma += x;
            x++;
        }
        System.out.println("soma total: " + soma);

    }
}
