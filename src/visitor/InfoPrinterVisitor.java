package visitor;

import model.Album;
import model.MusicItem;
import model.Playlist;
import model.Song;

public class InfoPrinterVisitor implements MusicVisitor {
    @Override
    public void visit(Song song) {
        System.out.println("Song: " + song.getTitle()+ "- "+ song.getArtist()+ "(" + song.getDuration() + ") sec");
    }
    public void visit(Album album) {
        System.out.println("Album: "+album.getName());
        for (Song song : album.getSongs()) {
            song.accept(this);
        }
    }
    public void visit(Playlist playlist) {
        System.out.println("Playlist: " +playlist.getItems());
        for (MusicItem item : playlist.getItems()) {
            item.accept(this);
        }
    }
}
