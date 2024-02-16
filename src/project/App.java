package project;
import java.util.Scanner;
public class App {
    public static void main(String[] args){
        System.out.println("ciao do while");
        Scanner in = new Scanner(System.in);
        boolean ok = false;
        boolean ok1 = false;
        boolean ok2 = false;
    
        int cont = 0;
        do {
            if(cont ==4){
                System.out.println("too much trys");
                break;
            }
            cont++;
            System.out.println("quanti giorni ha maggio?");
            int nMaggio = in.nextInt();
            if (nMaggio == 31){
                System.out.println("vero vero");
                ok1 = true;
            } else {
                System.out.println("no");
            }
            System.out.println("mesi de natale?");
            in.nextLine();
            String mesiNatale = in.nextLine();
            mesiNatale = mesiNatale.toLowerCase();
            mesiNatale = mesiNatale.trim();
            if (mesiNatale.equals("dicembre")){
                System.out.println("feliz natal");
                ok2 = true;
            } else {
                System.out.println("no");
            } 
            if (ok1 && ok2) ok=true;
        }
        while (ok1 == false || ok2 == false);
        in.close(); 
    } }

