package personalprojecs;

import java.io.FileWriter;
import java.util.Scanner;

class Artist {

    private String artist;
    private String pronouns;
    private String email;
    private String website;
    private String videoLink;
    private String videoDescription;

    public static String dataCollect(String question) {
        Scanner reader = new Scanner(System.in);
        String res = "";
        System.out.println(question);
        res = reader.nextLine();
        return res;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getPronouns() {
        return pronouns;
    }

    public void setPronouns(String pronouns) {
        this.pronouns = pronouns;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getVideoLink() {
        return videoLink;
    }

    public void setVideoLink(String videoLink) {
        this.videoLink = videoLink;
    }

    public String getVideoDescription() {
        return videoDescription;
    }

    public void setVideoDescription(String videoDescription) {
        this.videoDescription = videoDescription;
    }

}
