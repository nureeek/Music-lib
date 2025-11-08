package model;

import visitor.MusicVisitor;

import java.util.List;

public class Playlist implements MusicItem{
    private final String title;
    private final List<MusicItem> items;
    public Playlist(String title, List<MusicItem> items) {
        this.title = title;
        this.items = items;
    }
    public String getTitle() {
        return title;
    }
    public List<MusicItem> getItems() {
        return items;
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
