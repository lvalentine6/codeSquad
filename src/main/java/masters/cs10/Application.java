package masters.cs10;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        String[] status = {"new", "ready", "running", "waiting", "terminated"};
        Process[] processes = new Process[6];

        generateProcesses(status, processes);

        for (Process p : processes) {
            System.out.println(p.toString());
        }
    }

    static void generateProcesses(String[] status, Process[] processes) {
        char nameIndex = 'A';
        int maxOperatingTime = 0;

        for (int i = 0; i < 6; i++) {
            processes[i] = new Process(nameIndex++, 0, maxOperatingTime += 3, 0, status[0]);
        }
    }
}
