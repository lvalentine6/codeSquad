package masters.cs10;

public class OutputView {
    public void printProgress(Process[] processes) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            if (processes[i].isUsing()) {
                stringBuilder.append(processes[i].getName())
                        .append("(")
                        .append(processes[i].getStatus())
                        .append(")")
                        .append(", ")
                        .append(processes[i].getOperatingTime())
                        .append(" / ")
                        .append(processes[i].getMaxOperatingTime())
                        .append(" sec")
                        .append(" , ")
                        .append("waiting ")
                        .append(processes[i].getWaitingTime())
                        .append(" sec")
                        .append("\n");
            }
        }
        System.out.println(stringBuilder);
    }

    public void printProgressInit(Process[] processes) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            if (processes[i].isUsing()) {
                stringBuilder.append(processes[i].getName())
                        .append("(")
                        .append(processes[i].getStatus())
                        .append(")")
                        .append(", ")
                        .append(processes[i].getOperatingTime())
                        .append(" / ")
                        .append(processes[i].getMaxOperatingTime())
                        .append(" sec")
                        .append("\n");
            }
        }
        System.out.println(stringBuilder);
    }
}
