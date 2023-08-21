package sweeper;

import java.awt.*;

public enum Box {
    ZERO,
    NUM1,
    NUM2,
    NUM3,
    NUM4,
    NUM5,
    NUM6,
    NUM7,
    NUM8,
    BOMB,
    OPENED,
    CLOSED,
    FLAGED,
    BOMBED,
    NOBOMB;

    public Object image;

    public Box getNextNumberBox()
    {
        return Box.values()[this.ordinal() + 1];
    }
}
