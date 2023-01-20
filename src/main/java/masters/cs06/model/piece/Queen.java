package masters.cs06.model.piece;

import java.util.List;
import masters.cs06.model.Position;

public class Queen implements ChessPiece {
    private static int queenCode = 0;
    private final char color;
    private Position position;

    public Queen(char color, Position position) {
        this.color = color;
        this.position = position;
    }

    @Override
    public List<String> possiblePositions() {
        return null;
    }
}
