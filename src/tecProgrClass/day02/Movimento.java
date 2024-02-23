package tecProgrClass.day02;

import java.time.LocalDateTime;

public class Movimento {

    //atributo o proprieta della classe
    float importo = 0;
    LocalDateTime data;
    String txdata="";

    public String getRigaCSV(){
        String res = "";
        res = importo + "," + txdata + "\n";
        return res;
    }

    public String getHeadCSV(){
        return "importo, data \n";
    }

    public String getRigaCSVXL(){
        String res = "";
        res = importo + "," + txdata + ",\n";
        return res;
    }

}
