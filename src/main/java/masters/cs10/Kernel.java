package masters.cs10;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Kernel {
    private final Process[] processes;
    private final Queue<Process> readyQueue;
    private int runtime;
    private final int averageWaitingTime;
    private final int averageReturnTime;

    public Kernel(Process[] process) {
        this.processes = process;
        this.readyQueue = new LinkedList<>();
        this.runtime = 0;
        this.averageWaitingTime = 0;
        this.averageReturnTime = 0;
    }

    public void generateProcesses() {
        char nameIndex = 'A';
        int maxOperatingTime = 0;

        for (int i = 0; i < 6; i++) {
            processes[i] = new Process(nameIndex++, 0, maxOperatingTime += 3, 0, "new");
        }
    }

    public void chooseProcess() {
        Random random = new Random();
        int processesSize = 0;
        while (processesSize < 3) {
            int index = random.nextInt(5);
            if (!processes[index].isUsing()) {
                processes[index].changeStatusReady();
                readyQueue.add(processes[index]);
                processes[index].changeUsing();
                processesSize++;
            }
        }

        for (Process p : processes) {
            System.out.println(p.toString());
        }
//
//        System.out.println(readyQueue);
    }

    public void runProcesses() {
        while (!readyQueue.isEmpty()) {
            Process temp = readyQueue.poll();
            temp.changeStatusRunning();
            temp.plusOperatingTime();

            for (Process p : readyQueue) {
                p.changeStatusWaiting();
                p.plusWaitingTime();
            }

            if (temp.isComplete()) {
                readyQueue.add(temp);
            }
            runtime++;

            for (Process p : readyQueue) {
                System.out.print(p.returnProcessString());
            }
            System.out.println();
        }
    }
}
