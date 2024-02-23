package tecProgrClass.day02;

import java.io.FileWriter;

public class Util {
    void salvaFileTxt(String nameFile, String textFile){
         try {
                FileWriter fw = new FileWriter(nameFile);
                fw.write(textFile);
                fw.close();
            }
            catch(Exception e){
                System.out.println("something went wrong");
            }
    }
}
