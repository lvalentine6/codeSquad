package masters.cs15;

public class Application {
    public static void main(String[] args) {
        InputView inputView = new InputView();
        OutputView outputView = new OutputView();
        PcRoomDao pcRoomDao = new PcRoomDao();

        outputView.printHeader();

        while (true) {
            String input = inputView.inputCommand();

            if(input.equals("Q")) {
                break;
            }
        }

        outputView.printFooter();
    }
}
