package masters.cs06.model;

import java.util.HashMap;
import java.util.Map;
import masters.cs06.model.piece.ChessPiece;
import masters.cs06.model.piece.Pawn;

public class Board {
    private final Object[][] chessBoard;

    public Board(Object[][] chessBoard) {
        this.chessBoard = chessBoard;
    }

    public boolean move(String from, String to) {

        return false;
    }

    public String[][] display() {
        return null;
    }

    public void initPiece(ChessPiece chessPiece) {
        Pawn pawn = new Pawn('W', null);
        Position position = new Position();
        Map<Pawn, Position> map = new HashMap<>();
    }

    public void setPiece() {

    }
}
