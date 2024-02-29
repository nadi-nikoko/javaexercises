package tecProgrClass.day03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import tecProgrClass.day02.Util;

public class BiblioAsilo {

    Util helper = new Util();
    String nomeasilo;
    static ArrayList<Libro> elencoLibri = new ArrayList<Libro>();

    public static void main(String[] args) {

        while (true) {
        String menu = getMenu();

        switch (menu) {
            case "B":
                listBook();
                break;
            case "S":
                List<Libro> books = searchBook2();
                if (books.size()>0)
                System.out.println("the books available with this name are:");
                else System.out.println("no books with this name");
                for (Libro book : books) {
                    System.out.println(book.title + " " + book.author);
                }
                break;
            case "L":
                lendBook();
                break;
            case "R":
                returnBook();
                break;
            case "A":
                addBook();
                break;
            case "E":
                break;
            default:
                System.out.println("\"" + menu + "\"  its not a option");
        }
        if (menu.equals("E")) break;

        //caricare tutti libri in elencoLibri
        //caricaLibri()
        // inizia cilico infinitoo while per chiedere o comandi 
        // presento le vie di menu disponibili
        //print menu
        // scanner lettere
    }
}


    public static void addBook() {

        System.out.println("what is the title of the book");
        Scanner reader = new Scanner(System.in);
        String title = reader.nextLine().toUpperCase().trim();
        System.out.println("what is the books author?");
        String author = reader.nextLine().toUpperCase().trim();
        System.out.println("title: " + title + " and author: " + author);
        System.out.println("confirm? (y/n)");
        String confirmation = reader.nextLine().toUpperCase().trim();

        if (confirmation.equals("Y") || confirmation.equals("")){
            if (author.length()>0 && title.length()>0){
                Libro livro = new Libro(author, title);
                elencoLibri.add(livro);
                System.out.println("book add to the system");
            } else System.out.println("not enough data // try again");
        } else System.out.println("not confirmed");
    
    }


    public static int searchBook(){
        int res = -1;
        System.out.println("which title are you looking for?");
        Scanner reader = new Scanner(System.in);
        String titleToFind = reader.nextLine().toUpperCase().trim();
        for (int i= 0; i < elencoLibri.size(); i++){
            String curtitle = elencoLibri.get(i).title;
            if(titleToFind.equalsIgnoreCase(curtitle)){
                res = i;
                break;
            } 
        }
        return res;
    }

    public static List<Libro> searchBook2(){
        System.out.println("which title are you looking for?");
        Scanner reader = new Scanner(System.in);
        String titleToFind = reader.nextLine().toUpperCase().trim();

        List<Libro> matchingLibros = new ArrayList<>();

        for (Libro libro: elencoLibri){
            if(titleToFind.equalsIgnoreCase(libro.title)){
                matchingLibros.add(libro);
            }
        }

        return matchingLibros;
    }

    public static void returnBook() {
        int poslibro= -1;
        poslibro = searchBook();
        if (poslibro >= 0){
            elencoLibri.get(poslibro).restituzioneLibro();
            System.out.println("thanks for returning the book");
            updateBiblio();
        } else System.out.println("something went wrong please make sure that the name of the book is correct");
   
    }

    public static void lendBook() {
        int poslibro= -1;
        poslibro = searchBook();
        if (poslibro >= 0){
            boolean ok = elencoLibri.get(poslibro).Inprestito();
            if (ok){
            System.out.println("the book is yours, please return");
            updateBiblio();
            }
        else System.out.println("book not available");
        }
    }

    public static void listBook() {
        int n = 1;
        for (Libro libro: elencoLibri){
            // you can use n++ so it prints n and then does ++ on n
            System.out.println(n++ + ") "+ libro.getInfoLibro());
        }

        /*
         * for (int=0; i<elencoLibro.size();i++){
         * System.out.println((1+1) + ") " + elencoLibri.get(i).getInfoLivro());
         * }
         */
        
    }

    public static void updateBiblio(){
        String txfile = "title;author;dataout;databack\n";
        for (Libro livro:elencoLibri){
            txfile += livro.getInfoCSV();
        }
    }


    public static String getMenu() {
        System.out.println(" ______________________________________ ");
        System.out.println("|                                      |");
        System.out.println("|--------------------------------------|");
        System.out.println("|||||   WELCOME TO ASILO LIBRARY   |||||");
        System.out.println("|--------------------------------------|");
        System.out.println("|                                      |");
        System.out.println("|--------------------------------------|");
        System.out.println("| [b] - list books    [l] - lend book  |");
        System.out.println("|--------------------------------------|");
        System.out.println("| [r] - return book   [a] - add book   |");
        System.out.println("|--------------------------------------|");
        System.out.println("| [x] - remove book   [e] exit menu    |");
        System.out.println("|--------------------------------------|");
        System.out.println("| [s] - search books                   |");
        System.out.println("|______________________________________|");
        Scanner reader = new Scanner(System.in);
        System.out.println("\n ------    how can i help you?   ------");
        String book = reader.nextLine().trim().toUpperCase();
        return book;
/* 
 * 
 * 
*/

    }
}


        /*
        Libro bookOne = new Libro("nadi nicoco", "plant love and chaos");
        Libro bookTwo = new Libro("nadi nicoco", "love will kill you");
        System.out.println("the writer " + bookOne.author + " wrote the book " + bookOne.title);
        bookOne.numpages = 12;
        bookTwo.numpages = 16;
        elencoLibri.add(bookOne);
        elencoLibri.add(bookTwo);

        //elencoLibri.get(0);
        Libro othernameforbookone = elencoLibri.get(0);
        bookOne.Inprestito();
        //Libro b1=elencoLibri.get(1);
        bookOne.restituzioneLibro();
        elencoLibri.get(0).numpages=13;
        othernameforbookone.numpages=123;
        System.out.println(" " + bookOne.numpages);
        */
