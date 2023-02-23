package masters.cs15;

public class Application {
    static boolean flag = false;
    public static void main(String[] args) {
        InputView inputView = new InputView();
        OutputView outputView = new OutputView();

        outputView.printHeader();

        PcRoomDao pcRoomDao = new PcRoomDao();

        outputView.printSeat();
        pcRoomDao.checkTable();

        while (!flag) {
            System.out.println(pcRoomDao.checkTable());
            System.out.println();
            checkCommand(pcRoomDao, inputView.inputCommand());
        }

        pcRoomDao.closeConnection();
        outputView.printFooter();
    }

    public static void checkCommand(PcRoomDao pcRoomDao, String input) {
        if(input.equals("new")) {
            pcRoomDao.updateUser();
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
