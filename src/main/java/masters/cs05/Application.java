package masters.cs05;

import masters.cs05.controller.ApplicationController;
import masters.cs05.model.Calculator;
import masters.cs05.model.Generator;
import masters.cs05.view.InputView;
import masters.cs05.view.OutputView;

public class Application {
    public static void main(String[] args) {
        ApplicationController applicationController = new ApplicationController(new InputView(), new OutputView(), new Generator(), new Calculator());
        applicationController.progress();
    }
}
