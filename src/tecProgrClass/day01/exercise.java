package tecProgrClass.day01;

import java.util.Scanner;

public class exercise {
 
    public static void main (String[] args){
        Scanner lettore = new Scanner(System.in);
        while(true){
            System.out.println("give me a integer number");
            int y = lettore.nextInt();
            LeggiN(y);
        }
       
       /*  Scanner lettore = new Scanner(System.in);
        System.out.println("insert X");
        float x = lettore.nextFloat();
        System.out.println("insert y");
        float y = lettore.nextFloat();
        float z;
        z = x;
        x = y;
        y = z;
        System.out.println("y eh "+y);
        System.out.println("x eh "+x);
        */

    }

    public static void LeggiN(int num){
        int n = num;
        int x = 0;

        while (x<=num){
            System.out.print(x + " ");
            x++;
        }
        System.out.println();

    }
}
