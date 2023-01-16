package masters.cs05;

import masters.cs05.controller.ApplicationController;
import masters.cs05.model.Point;
import masters.cs05.view.InputView;
import masters.cs05.view.OutputView;

public class Application {
    public static void main(String[] args) {
        ApplicationController applicationController = new ApplicationController(new InputView(), new OutputView());
        applicationController.progress();
    }
}
