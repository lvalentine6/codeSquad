package masters.cs06.model.piece;

import java.util.List;
import masters.cs06.model.Position;

public class Rook implements ChessPiece {
    final int pieceCode;
    final char color;
    Position position;

    public Rook(int pieceCode, char color, Position position) {
        this.pieceCode = pieceCode;
        this.color = color;
        this.position = position;
    }

    @Override
    public List<String> possiblePositions() {
        return null;
    }
}
