package masters.cs05.controller;

import java.util.List;
import masters.cs05.model.Calculator;
import masters.cs05.model.Generator;
import masters.cs05.model.Point;
import masters.cs05.view.InputView;
import masters.cs05.view.OutputView;

public class ApplicationController {
    private final InputView inputView;
    private final OutputView outputView;
    private final Generator generator;
    private final Calculator calculator;

    public ApplicationController(InputView inputView, OutputView outputView, Generator generator,
                                 Calculator calculator) {
        this.inputView = inputView;
        this.outputView = outputView;
        this.generator = generator;
        this.calculator = calculator;
    }

    public void progress() {
        outputView.printHeader();
        boolean flag = false;
        String input = "";
        while (!flag) {
            input = inputView.inputPoint();
            if (inputChaker(input)) {
                flag = true;
            }
        }

        List<Point> points = generator.makePoints(input);
        double result = calculator.calculateTwoPointDistance(points.get(0), points.get(1));
        String[][] coordinatePlane = generator.makeCoordinatePlane(points.get(0), points.get(1));
        outputView.printCoordinatePlane(coordinatePlane);
        outputView.printTwoPointDistance(result);
    }

    public boolean inputChaker(String input) {
        input = input.replaceAll("[()]", "");
        String[] stringSplit = input.split("[,-]");
        try {
            for (String s : stringSplit) {
                if (Integer.parseInt(s) > 24) {
                    throw new IllegalArgumentException("24 이하의 숫자만 입력하세요.");
                }
            }
        } catch (IllegalArgumentException illegalArgumentException) {
            outputView.printError();
            return false;
        }
        return true;
    }
}
