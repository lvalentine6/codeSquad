package masters.cs06.model.piece;

import java.util.List;
import masters.cs06.model.Position;

public class Knight implements ChessPiece {
    private static int knightCode = 0;
    private final char color;
    private Position position;

    public Knight(char color, Position position) {
        this.color = color;
        this.position = position;
    }

    @Override
    public List<String> possiblePositions() {
        return null;
    }
}
