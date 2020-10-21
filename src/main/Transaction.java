package main;

public class Transaction {

    private String sourceName;
    private String destinationName;
    private String musicName;
    private String artist;
    private String label;
    private String copyright;

    public Transaction(String sourceName,String destinationName, String musicName, String artist, String label, String copyright){
        this.sourceName = sourceName;
        this.destinationName = destinationName;
        this.musicName = musicName;
        this.artist= artist;
        this.label = label;
        this.copyright = copyright;
    }

    public String getSourceName() {
        return sourceName;
    }

    public void setSourceName(String sourceName) {
        this.sourceName = sourceName;
    }

    public String getDestinationName() {
        return destinationName;
    }

    public void setDestinationName(String destinationName) {
        this.destinationName = destinationName;
    }

    public String getMusicName() {
        return musicName;
    }

    public void setMusicName(String musicName) {
        this.musicName = musicName;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getCopyright() {
        return copyright;
    }

    public void setCopyright(String copyright) {
        this.copyright = copyright;
    }







}
