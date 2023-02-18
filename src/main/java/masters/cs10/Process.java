package masters.cs10;

public class Process {
    private final char name;
    private int operatingTime;
    private final int maxOperatingTime;
    private int waitingTime;
    private String status;
    private boolean using;

    public Process(char name, int operatingTime, int maxOperatingTime, int waitingTime, String status) {
        this.name = name;
        this.operatingTime = operatingTime;
        this.maxOperatingTime = maxOperatingTime;
        this.waitingTime = waitingTime;
        this.status = status;
        this.using = false;
    }

    public void changeStatusReady() {
        status = "ready";
    }

    public void changeStatusRunning() {
        status = "running";
    }

    public void changeStatusWaiting() {
        status = "waiting";
    }

    public void changeStatusTerminated() {
        status = "terminated";
    }

    public boolean isUsing() {
        return using;
    }

    public void changeUsing() {
        if (using) {
            using = false;
            return;
        }
        using = true;
    }

    public void plusOperatingTime() {
        ++operatingTime;
    }

    public void plusWaitingTime() {
        ++waitingTime;
    }

    public boolean isComplete() {
        return operatingTime < maxOperatingTime;
    }

    public String returnProcessInitString() {
        StringBuilder stringBuilder = new StringBuilder();
        if (isUsing()) {
            stringBuilder.append(name)
                    .append("(")
                    .append(status)
                    .append(")")
                    .append(", ")
                    .append(operatingTime)
                    .append(" / ")
                    .append(maxOperatingTime)
                    .append(" sec")
                    .append("\n");
        }
        return stringBuilder.toString();
    }

    public String returnProcessString() {
        String stringBuilder = name
                + "("
                + status
                + ")"
                + ", "
                + operatingTime
                + " / "
                + maxOperatingTime
                + " sec"
                + " , "
                + "waiting "
                + waitingTime
                + " sec"
                + "\n";
        return stringBuilder;
    }

    @Override
    public String toString() {
        return "Process{" +
                "name=" + name +
                ", operatingTime=" + operatingTime +
                ", maxOperatingTime=" + maxOperatingTime +
                ", waitingTime=" + waitingTime +
                ", status='" + status + '\'' +
                ", using=" + using +
                '}';
    }
}
