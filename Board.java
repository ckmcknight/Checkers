import java.util.ArrayList;
import java.util.List;

public class Board {
    private final int BOARD_SIZE = 8;
    private List<Piece> pieces = new ArrayList<>();
    Piece[][] board = new Piece[BOARD_SIZE][BOARD_SIZE];

    public Board() {
        // Add White Pieces
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 7; j += 2) {
                int offset = i % 2;
                addPiece(i, j + offset, Piece.Color.WHITE);
            }
        }

        // Add Red Pieces
        for (int i = 5; i < 8; i++) {
            for (int j = 0; j < 7; j += 2) {
                int offset = i % 2;
                addPiece(i, j + offset, Piece.Color.RED);
            }
        }
    }


    public void addPiece(int row, int col, Piece.Color color) {
        Piece newP = new Piece(row, col, color, BOARD_SIZE);
        pieces.add(newP);
        board[row][col] = newP;
    }

    @Override
    public String toString() {
        String outString = "";
        outString += "-------------------\n";
        outString += "  0 1 2 3 4 5 6 7  \n";
        for (int i = 0; i < BOARD_SIZE; i++) {
            outString += Integer.toString(i);
            outString += "|";
            for (int j = 0; j < BOARD_SIZE; j++) {
                Piece p = board[i][j];
                if (p != null) {
                    outString += p.toString() + " ";
                } else {
                    if ((i + j) % 2 == 0) {
                        outString += "# ";
                    } else {
                        outString += ". ";
                    }
                }
            }
            outString += "|\n";
        }
        outString += "-------------------";
        return outString;
    }

}
