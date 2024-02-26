package tecProgrClass.day03;

import java.time.LocalDateTime;
import java.time.Period;

public class Libro {
    // elenco attributi o pripeta
    String author;
    String title;
    String edition;
    int numpages;
    String fascia;
    LocalDateTime dataOut;
    LocalDateTime dataBack;

    // costruttore libro
    public Libro(String author, String title){
        this.author = author.toUpperCase().trim();
        this.title =  title.toUpperCase().trim();
    }

    // elenco metodi classe

    public void Inprestito(){
        dataBack=null;
        dataOut=LocalDateTime.now();
    }

    public void restituzioneLibro(){
        dataBack=LocalDateTime.now();
    }

    public int getDaysOut(){
        int res = 0;
        LocalDateTime adesso = LocalDateTime.now();
        Period period = Period.between(dataOut.toLocalDate(), adesso.toLocalDate());
        res = period.getDays();

        return res;

    }
}
