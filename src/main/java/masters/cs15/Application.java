package masters.cs15;

public class Application {
    static boolean flag = false;
    public static void main(String[] args) {
        InputView inputView = new InputView();
        OutputView outputView = new OutputView();

        outputView.printHeader();

        PcRoomDao pcRoomDao = new PcRoomDao();

        while (!flag) {
            System.out.println(pcRoomDao.checkTable());
            checkCommand(pcRoomDao, inputView.inputCommand());
        }

        pcRoomDao.closeConnection();
        outputView.printFooter();
    }

    public static void checkCommand(PcRoomDao pcRoomDao, String input) {
        if(input.equals("new")) {
            pcRoomDao.creatUser();
            return;
        }

        if(input.equals("stop")) {
            pcRoomDao.deleteUser();
            return;
        }

        if(input.equals("Q")) {
            flag = true;
        }
    }

    public int assignSeat() {
        return 0;
    }
}
