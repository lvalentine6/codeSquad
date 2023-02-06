package masters.cs10;

import java.util.LinkedList;
import java.util.Queue;

public class Application {
    public static void main(String[] args) {
        Kernel kernel = new Kernel();
        Process[] processes = new Process[6];
        Queue<Process> readyQueue = new LinkedList<>();

        kernel.generateProcesses(processes);
        kernel.chooseProcess(processes, readyQueue);

        for (Process p : processes) {
            System.out.println(p.toString());
        }

        System.out.println(readyQueue);
    }
}
