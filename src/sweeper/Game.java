package sweeper;

public class Game {
    Matrix bombMap;

    public Game(int cols, int rows) {
        Ranges.setSize(new Coord(cols, rows));
    }

    public void start(){
        bombMap = new Matrix(Box.ZERO);
        bombMap.set(new Coord(1, 3), Box.BOMB);
        bombMap.set(new Coord(7, 7), Box.BOMB);
        bombMap.set(new Coord(5, 4), Box.BOMB);
    }

    public Box getBox(Coord coord){
        return bombMap.get(coord);
    }
}
