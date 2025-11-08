package model;

import visitor.MusicVisitor;

public interface MusicItem {
    void accept(MusicVisitor visitor);
}
