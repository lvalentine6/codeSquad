package masters.cs06.controller;

import masters.cs06.model.Board;
import masters.cs06.model.Position;
import masters.cs06.model.piece.ChessPiece;
import masters.cs06.model.User;
import masters.cs06.view.InputView;
import masters.cs06.view.OutputView;

public class GameController {
    private final Board board;
    private final InputView inputView;
    private final OutputView outputView;
    private final User user;
    private ChessPiece chessPiece;
    private char order;

    public GameController(Board board, InputView inputView,
                          OutputView outputView, User user,
                          char order) {
        this.board = board;
        this.inputView = inputView;
        this.outputView = outputView;
        this.user = user;
        this.order = order;
    }

    public void gameStart() {
        outputView.printStart();
    }

    public void gameProgress() {
        outputView.printCommend();
        String inputCommend = inputView.inputCommend();
    }

    public void gameEnd() {

    }
}
