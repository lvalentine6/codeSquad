package masters.cs15;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Application {
    static boolean flag = false;
    static List<Integer> userList;

    public static void main(String[] args) {
        InputView inputView = new InputView();
        OutputView outputView = new OutputView();
        userList = new LinkedList<>();
        for (int i = 0; i < 16; i++) {
            userList.add(i + 1);
        }

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
        if (input.equals("new")) {
            Random random = new Random();
            int randomIndex = random.nextInt(16);
            int userIndex = userList.get(randomIndex);
            userList.remove(randomIndex);
            pcRoomDao.updateUser(userIndex);
            return;
        }

        if (input.length() > 3) {
            String[] temp = input.split(" ");
            int userIndex = Integer.parseInt(temp[1]);
            userList.add(userIndex);
            pcRoomDao.deleteUser(userIndex);
            return;
        }

        if (input.equals("Q")) {
            flag = true;
        }
    }
}
