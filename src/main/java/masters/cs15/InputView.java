package masters.cs15;

import java.io.InputStreamReader;
import java.util.Scanner;

public class InputView {
    Scanner scanner = new Scanner(System.in);
    public String inputCommand() {
        System.out.print("명령어를 입력하세요 : ");
        return scanner.nextLine();
    }
}
