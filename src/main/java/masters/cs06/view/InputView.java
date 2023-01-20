package masters.cs06.view;

import java.util.Scanner;

public class InputView {
    Scanner scanner;

    public InputView() {
        this.scanner = new Scanner(System.in);
    }

    public String inputCommend() {
        return scanner.nextLine();
    }
}
