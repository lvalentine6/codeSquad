package masters.cs10;

public class OutputView {
    public void printProgress(Process[] processes) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            stringBuilder.append(processes[i].returnProcessString());
        }
        System.out.println(stringBuilder);
    }
}
