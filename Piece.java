public class Piece {
    private Color color;
    private int boardSize;
    int x, y;

    public enum Color {
        WHITE, RED
    }

    public Piece (int x, int y, Color color, int boardSize) {
        this.color = color;
        this.x = x;
        this.y = y;
        this.boardSize = boardSize;
    }

    public Color getColor() {
        return color;
    }

    public boolean setLocation(int x, int y) {
        if (x < boardSize && y < boardSize) {
            this.x = x;
            this.y = y;
            return true;
        }
        return false;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        if (color == Color.WHITE) {
            return "W";
        } else {
            return "R";
        }
    }

}
