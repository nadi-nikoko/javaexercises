package tecProgrClass.day01;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class ContoArrayList {
    static ArrayList<Float> movimento = new ArrayList<Float>();
   
    
    static String contoCorrente = "";
    
    public static void main (String[] args){
       
        setContoCorrente();
        leggeCC();
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

    static void setContoCorrente() {
        Scanner lettore = new Scanner(System.in);
        String conta = "";
        while (true){
            System.out.println("insert conto corrente:");
            conta = lettore.nextLine();
            conta = conta.replaceAll(" ", "_");
           if (conta.length() > 0){
            break;
        } else System.out.println("wrong account");
    }
        contoCorrente = conta;
    }

    public static float askFloat(String domanda){
        float res = 0;
        while(true){
            Scanner getFloat = new Scanner(System.in);
            System.out.println(domanda);
            try{
                res = getFloat.nextFloat();
                break;
            } 
            catch(Exception e){
                System.out.println("write an integer number (ex; 1, 3, 25)");
                System.out.println("to get out write 0 (ex; 0)");
            } 
        }
        return res;

    }

    private static void insPrelivo() {

        float prelivo = askFloat("----INS IMPORTA DE PRELEVARE[ex: 88.99, ...]");
        if (prelivo <= 0 || prelivo > getSaldoValue()){
            System.out.println("invalid action");
            return;

        }
        movimento.add(-prelivo); 
        aggiornaCC();
        System.out.println("prelivo realizado");
        }

    private static void insVersamento() {
        float versamento = askFloat("----INS IMPORTA DA VERSARE [ex: 88.99, ...]");
        if (versamento <= 0){
            System.out.println("invalid action");
        } else{
            movimento.add(versamento);
            aggiornaCC();
            System.out.println("versamento realizado");
        }
    }

    static void leggeCC(){
        try{
            File f = new File(contoCorrente + ".txt");
            Scanner readMov = new Scanner(f);
            movimento.clear();
            while (readMov.hasNextLine()){
                String newMov = readMov.nextLine();
                float importo = Float.parseFloat(newMov);
                movimento.add(importo);
            }
        }
        catch (Exception e){
            System.out.println("conta doesnt existe");
            movimento.clear();
        }        
        
    }

    static void aggiornaCC() {
        String txtfile="";
        for (float mov: movimento){
            txtfile = txtfile + mov + "\n";
            try {
                FileWriter fw = new FileWriter(contoCorrente + ".txt");
                fw.write(txtfile);
                fw.close();
            }
            catch(Exception e){
                System.out.println("something went wrong");
            }
        }
    }

    private static void getList() {
        System.out.println("LISTA MOVIMENT:");
        int i = 1;
            for (float mov : movimento){
                System.out.println(i + " : " + mov);
                i++;

            }
            getSaldo();
        }
    

    private static void getSaldo() {
        System.out.println("Saldo corrente é $" + getSaldoValue());
    }
    
    private static float getSaldoValue() {
        float saldo = 0;  
        for (float mov : movimento){
            saldo = saldo + mov;
        }
        return saldo;
    }

    public static void printer(){
        System.out.println("----MENU BANCA----");
        System.out.println("[S] -----SALDO ATUAL------ [L] MOVEMENT LIST;");
        System.out.println("[V] VERSAMENTO ------     [P] PRELIEVO -----");
        System.out.println("--------------[E] EXIT TERMINAL -------------");
    }
}