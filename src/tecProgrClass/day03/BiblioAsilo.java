package tecProgrClass.day03;

import java.util.ArrayList;

public class BiblioAsilo {

    String nomeasilo;
    static ArrayList<Libro> elencoLibri = new ArrayList<Libro>();

    public static void main(String[] args) {
        Libro bookOne = new Libro("nadi nicoco", "plant love and chaos");
        Libro bookTwo = new Libro("nadi nicoco", "love will kill you");
        System.out.println("the writer " + bookOne.author + " wrote the book " + bookOne.title);
        bookOne.numpages = 12;
        bookTwo.numpages = 16;
        elencoLibri.add(bookOne);
        elencoLibri.add(bookTwo);

        //elencoLibri.get(0);
        bookOne.Inprestito();
        //Libro b1=elencoLibri.get(1);
        bookOne.restituzioneLibro();
        elencoLibri.get(1).numpages=123;
        System.out.println(" " + bookOne.dataOut);
}
}
