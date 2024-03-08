package personalprojecs;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class RandomRainbow {

    static ArrayList<Artist> dbArtist = new ArrayList<Artist>();

    public static void main(String[] args) {
        System.out.println("welcome to random rainbow");
        addNewArtist();
        String name = dbArtist.get(0).getArtist();
        System.out.println(name);
        addNewArtist();
        // System.out.println(dbArtist.get(pickRandomVideo()).getVideoLink());
    }

    public static void addNewArtist() {
        Scanner reader = new Scanner(System.in);
        System.out.println("artist or collective name");
        String artist = reader.nextLine().toUpperCase();
        System.out.println("pronouns");
        String pronouns = reader.nextLine().toLowerCase();
        System.out.println("email");
        String email = reader.nextLine().toLowerCase().trim();
        System.out.println("website");
        String website = reader.nextLine().toLowerCase();
        System.out.println("video link");
        String videoLink = reader.nextLine().toLowerCase();
        System.out.println("description of video");
        String videoDescription = reader.nextLine();
        Artist newArtist = new Artist(artist, pronouns, email, website, videoLink, videoDescription);
        if (checkData(newArtist))
            dbArtist.add(newArtist);
    }

    /**
     * to check if the artist is already on our database or not
     * if its needed to control limited ammout of videos sent
     * 
     * @param newArtist
     * @return true if there is no data with same name and false if finds name on
     *         database
     */
    private static boolean checkData(Artist newArtist) {
        boolean available = true;
        for (int i = 0; i < dbArtist.size(); i++) {
            if (newArtist.getArtist().equals(dbArtist.get(i).getArtist())) {
                available = false;
                System.out.println("this name is already on our database");
            }
        }
        return available;
    }

    public static int pickRandomVideo() {
        Random randomGenerator = new Random();
        int random = randomGenerator.nextInt(dbArtist.size());
        return random;
    }

}
