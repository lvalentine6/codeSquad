package masters.cs06;

import masters.cs06.controller.GameController;
import masters.cs06.model.Board;
import masters.cs06.model.User;
import masters.cs06.view.InputView;
import masters.cs06.view.OutputView;

public class Application {
    public static void main(String[] args) {
        final int RANK_SIZE = 8;
        final int FILE_SIZE = 8;

        Board board = new Board(new Object[RANK_SIZE][FILE_SIZE]);
        InputView inputView = new InputView();
        OutputView outputView = new OutputView();
        User user = new User();
        GameController gameController = new GameController(board, inputView, outputView, user, 'W');

        gameController.gameStart();
        gameController.gameProgress();

    }
}
