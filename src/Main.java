import model.Album;
import model.Playlist;
import model.Song;
import visitor.DurationCalculatorVisitor;
import visitor.InfoPrinterVisitor;

import java.util.List;


public class Main {
    public static void main(String[] arags) {
        Song s1=new Song("Almaty tuni","Kairat Nurtas",181);
        Song s2=new Song("Meili","Yenlik",153);
        Song s3=new Song("Dom 50","Prince",200);
        Album album=new Album("Hittar", List.of(s1,s2));
        Playlist playlist=new Playlist("Myy",List.of(album,s3));

        InfoPrinterVisitor infoPrinterVisitor=new InfoPrinterVisitor();
        playlist.accept(infoPrinterVisitor);

        DurationCalculatorVisitor durationCalculatorVisitor=new DurationCalculatorVisitor();
        playlist.accept(durationCalculatorVisitor);
        System.out.println("Total duration:"+durationCalculatorVisitor.getDuration()+" sec");

    }
}