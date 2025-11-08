package model;

import visitor.MusicVisitor;

public class Song implements MusicItem {
    private final String Title;
    private final String Artist;
    private final int Duration;
    public Song(String title, String artist, int duration) {
        this.Title = title;
        this.Artist = artist;
        this.Duration = duration;
    }
    public String getTitle() {
        return Title;
    }
    public String getArtist() {
        return Artist;
    }
    public int getDuration() {
        return Duration;
    }
    @Override
    public String toString() {
        return getTitle();
    }
    @Override
    public void accept(MusicVisitor visitor) {
        visitor.visit(this);
    }
}
