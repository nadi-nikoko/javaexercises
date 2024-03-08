package personalprojecs;

class Artist {

    private String artist;
    private String pronouns;
    private String email;
    private String website;
    private String videoLink;
    private String videoDescription;
    // NONE as default so data goes to a list that is not in use by the website yet,
    // once approved it goes to a VideoTime that is listed for the website
    VideoTime time = VideoTime.NONE;

    public Artist(String artist, String pronouns, String email, String website, String videoLink,
            String videoDescription) {
        this.artist = artist;
        this.pronouns = pronouns;
        this.email = email;
        this.website = website;
        this.videoLink = videoLink;
        this.videoDescription = videoDescription;

    }

    /*
     * 
     * (SHORT for < 3min,
     * LONG for < 10min,
     * ALL for all videos
     * NONE(default) -- submitted but not approved yet)
     */
    public enum VideoTime {
        SHORT, LONG, ALL, NONE;
    }

    /*
     * 
     * Methods for Get and Set Data;
     * 
     */

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

    public VideoTime getTime() {
        return time;
    }

    public void setTime(VideoTime time) {
        this.time = time;
    }
}
