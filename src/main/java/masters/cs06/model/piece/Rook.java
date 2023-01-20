package masters.cs06.model.piece;

import java.util.List;
import masters.cs06.model.Position;

public class Rook implements ChessPiece {
    private static int rookCode = 0;
    private final char color;
    private Position position;

    public Rook(char color, Position position) {
        this.color = color;
        this.position = position;
    }

    @Override
    public List<String> possiblePositions() {
        return null;
    }
}
