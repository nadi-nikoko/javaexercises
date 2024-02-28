package personalprojecs;

import java.util.ArrayList;

public class RandomRainbow {
 public static void main(String[] args) {
    ArrayList<Artist> ArtistList = new ArrayList<Artist>();

    while(true){
    
    Artist newArtist= Function.AddArtist();

    ArtistList.add(newArtist);

    for (Artist artist: ArtistList){
        System.out.println("artist: "+artist.artist+" ("+ artist.pronouns + ")\n email: " + artist.email + 
        "\n video description:" + artist.videoDescription +"\n video link:"+ artist.videoLink + "\n website:" + artist.website);
    }
    }   
}

}
