package tecProgrClass.day01;

import java.util.Date;

public class Dezenovedodois {
    
    public static void main(String[] args){
       stampaOra();
       int maior = getHigher(3, 4,6,7,5,8,6,9,12);
       System.out.println(maior);
    }

    public static void stampaOra(){
        Date clock = new Date();
        String dataora = clock.toLocaleString();
        System.out.println(dataora); 
    }

    //public static int getHigher(int n1, int n2){
      //  return Math.max(n1, n2);
    //}

    public static int getHigher(int n1, int n2, int n3, int n4){
        int res = 0;
        int[] numbers = {n1,n2,n3,n4};
        for (int i = 0; i < numbers.length; i++){
                if (numbers[i] > res){
                    res = numbers[i];
                }
            }
        return res;
    }


public static int getHigher(int... numbers){
    int res = 0;
    for (int number : numbers){
            if (number > res){
                res = number;
            }
        }
    return res;
}
}
