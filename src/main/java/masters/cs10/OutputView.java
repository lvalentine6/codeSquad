package masters.cs10;

import java.util.Queue;

public class OutputView {
    public void printStart() {
        String stringBuilder = "6개 프로세스 중 랜덤으로 3개의 프로세스를 선택합니다."
                + "\n"
                + "라운드 로빈 방식 적용"
                + "\n";
        System.out.println(stringBuilder);
    }

    public void printInit(Process[] processes) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            stringBuilder.append(processes[i].returnProcessInitString());
        }
        System.out.println(stringBuilder);
    }

    public void printProgress(Queue<Process> readyQueue) {

        System.out.println("");
    }
}
