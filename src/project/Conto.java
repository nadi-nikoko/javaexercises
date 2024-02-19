package project;

import java.util.Scanner;

public class Conto {

    static float [] movimento = new float[100];

    
    public static void printer(){
        System.out.println("----MENU BANCA----");
        System.out.println("[S] -----SALDO ATUAL------ [L] MOVEMENT LIST;");
        System.out.println("[V] VERSAMENTO ------     [P] PRELIEVO -----");
        System.out.println("--------------[E] EXIT TERMINAL -------------");
    }
    
    public static void main (String[] args){
       
        while(true){
            printer();
            Scanner reader = new Scanner(System.in);
            String choice = reader.nextLine();
            choice = choice.toLowerCase();
            if (choice.equals("s")){
                getSaldo();
            }
            if (choice.equals("l")){
                getList();
            }
            if (choice.equals("v")){
                insVersamento();
            }
            if (choice.equals("p")){
                insPrelivo();
            }
            if (choice.equals("e")){
                break;
            }
        }
       
    }

    private static void insPrelivo() {
        Scanner getFloat = new Scanner(System.in);
        System.out.println("----INS IMPORTA DE PRELEVARE[ex: 88.99, ...]");
        float prelivo = getFloat.nextFloat();
        if (prelivo < 0 || prelivo > getSaldoValue()){
            System.out.println("invalid action");
        } else{
            for (int i=0; i<movimento.length; i++){
                if (movimento[i] == 0){
                    movimento[i] = -prelivo;
                    break;
                }
            
            }
            System.out.println("prelivo realizado");
        }
    }

    private static void insVersamento() {
        Scanner getFloat = new Scanner(System.in);
        System.out.println("----INS IMPORTA DA VERSARE [ex: 88.99, ...]");
        float versamento = getFloat.nextFloat();
        if (versamento < 0){
            System.out.println("invalid action");
        } else{
            for (int i=0; i<movimento.length; i++){
                if (movimento[i] == 0){
                    movimento[i] = versamento;
                    break;
                }
            
            }
            System.out.println("versamento realizado");
        }
    }

    private static void getList() {
        System.out.println("LISTA MOVIMENT:");
        for (int i=0; i <movimento.length; i++){
            if (movimento[i] == 0){
                break;
            }
            String line = (i+1) + ") " + movimento[i];
            System.out.println(line);
        }
        getSaldo();
    }

    private static void getSaldo() {
        System.out.println("Saldo corrente é $" + getSaldoValue());
    }
    private static float getSaldoValue() {
        float saldo = 0;  
        for (int i = 0; i <100; i++){
            saldo = saldo + movimento[i];
        }
        return saldo;
    }

}