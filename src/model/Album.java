package model;

import visitor.MusicVisitor;

import java.util.List;

public class Album implements  MusicItem {
    private final  String name;
    private final List<Song> songs;
    public Album(String name, List <Song> songs) {
        this.name = name;
        this.songs = songs;
    }
    public String getName() {
        return name;
    }
    public List<Song> getSongs() {
        return songs;
    }
    @Override
    public String toString() {
        return getName();
    }

    @Override
    public void accept(MusicVisitor visitor) {
        visitor.visit(this);
    }
}
