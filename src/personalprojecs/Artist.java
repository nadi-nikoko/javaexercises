package personalprojecs;

import java.io.FileWriter;
import java.util.Scanner;

public class Artist {

    String artist;
   String pronouns;
   String email;
   String website;
   String videoLink;
   String videoDescription;

   public Artist(String artist, String pronouns, String email, String website, String videoLink, String videoDescription){
    this.artist = artist.toUpperCase().trim();
    this.pronouns = pronouns.toUpperCase().trim();
    this.email = email.toUpperCase().trim();
    this.website = website.toUpperCase().trim();
    this.videoLink = videoLink.toUpperCase().trim();
    this.videoDescription = videoDescription.toUpperCase().trim();
   }


   public static String dataCollect(String question){
    Scanner reader = new Scanner(System.in);
    String res = "";
    System.out.println(question);
    res = reader.nextLine();
    return res;
}


   public static void saveFileCSV (String nameFile, String nametxt){
    try {
        FileWriter artistData = new FileWriter (nameFile);
        artistData.write(nametxt);
        artistData.close();
    }
    catch(Exception e){
        System.out.println("something went wrong");
    }
}

}