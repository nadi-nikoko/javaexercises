package project;
import java.util.Scanner;
public class App {

    public static int askNumber(String question){
        System.out.println("---send me a integer number---");
        int result = -1;
        boolean ok = true;
        while (ok == true) {
            System.out.println(question);
            try{
                Scanner in = new Scanner(System.in);
                result = in.nextInt();
                ok = false;
            } catch (Exception e){
                System.out.println(e.toString());
                System.out.println("attention you need to send a integer number (ex; 1, 2, 3...)");
            }
    
        }
        return result;
    }
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
            if(!ok1){
                String dom = "quanti giorni ha maggio?";
                int nMaggio = askNumber(dom);
                if (nMaggio == 31){
                    System.out.println( "vero vero");
                    ok1 = true;
                } else {
                    System.out.println("no");
                }
            }
            if(!ok2){
                System.out.println("mesi de natale?");
                String mesiNatale = in.nextLine();
                mesiNatale = mesiNatale.toLowerCase();
                mesiNatale = mesiNatale.trim();
                if (mesiNatale.equals("dicembre")){
                    System.out.println("feliz natal");
                    ok2 = true;
                } else {
                    System.out.println("no");
                } 
            }
            if (ok1 && ok2) ok=true;
        }
        while (ok1 == false || ok2 == false);
        in.close(); 
    } }
    

