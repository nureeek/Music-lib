package visitor;

import model.Album;
import model.MusicItem;
import model.Playlist;
import model.Song;

public class DurationCalculatorVisitor implements MusicVisitor {
    private int duration=0;
    @Override
    public void visit(Song song) {
        duration+=song.getDuration();
    }
    @Override
    public void visit(Album album) {
        for (Song song : album.getSongs()) {
            song.accept(this);
        }
    }
    @Override
    public void visit(Playlist playlist) {
        for(MusicItem item : playlist.getItems()) {
            item.accept(this);
        }
    }
    public int getDuration() {
        return duration;
    }
}
