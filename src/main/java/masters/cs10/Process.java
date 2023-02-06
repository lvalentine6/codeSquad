package masters.cs10;

public class Process {
    private final char name;
    private int operatingTime;
    private final int maxOperatingTime;
    private int waitingTime;
    private String status;

    public Process(char name, int operatingTime, int maxOperatingTime, int waitingTime, String status) {
        this.name = name;
        this.operatingTime = operatingTime;
        this.maxOperatingTime = maxOperatingTime;
        this.waitingTime = waitingTime;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Process{" +
                "name=" + name +
                ", operatingTime=" + operatingTime +
                ", maxOperatingTime=" + maxOperatingTime +
                ", waitingTime=" + waitingTime +
                ", status='" + status + '\'' +
                '}';
    }
}
