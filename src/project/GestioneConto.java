package project;

import java.io.File;
import java.io.FileWriter;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class GestioneConto {
    static ArrayList<Float> movimento = new ArrayList<Float>();
    // formato data standard mondiale "2024-02-22 12:00:00"
    static ArrayList<String> dateMovimento = new ArrayList<String>();
    static ArrayList<Movimento> listaMovimentos = new ArrayList<>();
    static String contoCorrente = "";
    Util helper = new Util();

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
        // pronti per inserire prelivo in movimenti
        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter mydate = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String txtDate = dateTime.format(mydate);
        dateMovimento.add(txtDate);
        movimento.add(-prelivo); 
        // creo un nuovo ogetto di tipo mocimento e ad to listmovimento
        Movimento mov = new Movimento();
        mov.data = dateTime;
        mov.txdata = txtDate;
        mov.importo = -prelivo;
        listaMovimentos.add(mov);

        aggiornaCC();
        System.out.println("prelivo realizado");
        }

    private static void insVersamento() {
        float versamento = askFloat("----INS IMPORTA DA VERSARE [ex: 88.99, ...]");
        if (versamento <= 0){
            System.out.println("invalid action");
        } else{
             // pronti per inserire prelivo in movimenti
             LocalDateTime dateTime = LocalDateTime.now();
             DateTimeFormatter mydate = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
            String txtDate = dateTime.format(mydate);
            dateMovimento.add(txtDate);
            movimento.add(versamento);
            Movimento mov = new Movimento();
            mov.data = dateTime;
            mov.txdata = txtDate;
            mov.importo = -versamento;
            listaMovimentos.add(mov);
    
            aggiornaCC();
            System.out.println("versamento realizado");
        }
    }

    static void leggeCC(){
        try{
            File f = new File(contoCorrente + ".csv");
            Scanner readMov = new Scanner(f);
            movimento.clear();
            dateMovimento.clear();
            String newMov = readMov.nextLine();
            while (readMov.hasNextLine()){
                newMov = readMov.nextLine();
                //ecemplo "123.45 , 2024-02....""
                String [] itemsMove = newMov.split(",");
                float importo = Float.parseFloat(itemsMove[0]);
                movimento.add(importo);
                dateMovimento.add(itemsMove[1]);
            }
        }
        catch (Exception e){
            System.out.println("conta doesnt existe");
            movimento.clear();
        }        
        
    }

    static void aggiornaCC() {
        String txtfile= new Movimento().getHeadCSV();
        for (Movimento mov : listaMovimentos){
            txtfile +=  mov.getRigaCSV();
        }

        Util helper = new Util();
        helper.salvaFileTxt(contoCorrente+".csv", txtfile);
    }
        
        //int i = 0;
        //for (float mov: movimento){
    
            //String data = dateMovimento.get(i);
            //txtfile += mov + "," + data + "\n";
            //i++;
          /*   try {
                FileWriter fw = new FileWriter(contoCorrente + ".csv");
                fw.write(txtfile);
                fw.close();
            }
            catch(Exception e){
                System.out.println("something went wrong");
            }
        }
        */

    private static void getList() {
        System.out.println("LISTA MOVIMENT:");
        int i = 1;
            for (float mov : movimento){
                String riga = i + ") " + mov + " - il " + dateMovimento.get(i-1);
                System.out.println(riga);
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