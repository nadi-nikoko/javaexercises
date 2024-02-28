package personalprojecs;

public class Function {

    public static Artist AddArtist(){
        String artist = Artist.dataCollect("artist name");
        String pronouns = Artist.dataCollect("pronouns");
        String email = Artist.dataCollect("email");
        String website = Artist.dataCollect("website or social media link");
        String videoLink = Artist.dataCollect("video link");
        String videoDescription = Artist.dataCollect("give a short description of the video");
    
        Artist newArtist = new Artist(artist, pronouns, email, website, videoLink, videoDescription);
    
        return newArtist;
     }
}
