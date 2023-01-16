package masters.cs05.controller;

import java.util.List;
import masters.cs05.model.Point;
import masters.cs05.view.InputView;
import masters.cs05.view.OutputView;

public class ApplicationController {
    private InputView inputView;
    private OutputView outputView;
    private List<Point> list;

    public ApplicationController(InputView inputView, OutputView outputView) {
        this.inputView = inputView;
        this.outputView = outputView;
    }

    public void progress() {
        outputView.printHeader();
        boolean flag = false;
        while (!flag) {
            String input = inputView.inputPoint();
            if(inputChaker(input)) {
                flag = true;
            }
        }
    }

    public boolean inputChaker(String input) {
        String[] stringSplit = input.split("[-()]");
    }
}
