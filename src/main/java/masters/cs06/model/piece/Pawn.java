package masters.cs06.model.piece;

import java.util.List;
import masters.cs06.model.Position;

public class Pawn implements ChessPiece {
    private static int pawnCode = 0;
    private final char color;
    private Position position;

    public Pawn(char color, Position position) {
        this.color = color;
        this.position = position;
    }

    @Override
    public List<String> possiblePositions() {
        return null;
    }
}
