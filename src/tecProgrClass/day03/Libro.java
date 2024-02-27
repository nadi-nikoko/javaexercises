package tecProgrClass.day03;

import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

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

    public boolean Inprestito(){
        boolean res = false;
        if(!(dataBack == null && dataOut!= null)){
            dataBack = null;
            dataOut = LocalDateTime.now();
            res = true;
        }
        return res;
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

    public String getInfoLibro(){
        
        String pre = "[ ] ";
        if(dataBack==null && dataOut != null)
            pre = "[X] ";    
        return pre + "Title: " + title + "- Author: " + author;
   }

   public String getInfoCSV(){

    String res = title + ";" + author + ";";
    DateTimeFormatter mydate = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
    String txtDataOut = ""; 
    if (dataOut != null)
        txtDataOut = dataOut.format(mydate);
    String txtDataBack = ""; 
    if (dataBack != null)
        txtDataBack = dataBack.format(mydate);

    res += txtDataOut + ";" + txtDataBack;
    return res + "\n";
   }

}
