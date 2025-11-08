package visitor;

import model.Album;
import model.Playlist;
import model.Song;

import java.util.List;

public interface MusicVisitor {
    void visit(Song song);
    void visit(Album album);
    void visit(Playlist playlist);
}
