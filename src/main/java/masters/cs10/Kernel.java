package masters.cs10;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Kernel {
    private final PCB[] pcb;
    private final Process[] processes;
    private final Queue<Process> readyQueue;
    public static final int PROCESS_SIZE = 6;

    public Kernel() {
        this.pcb = new PCB[PROCESS_SIZE];
        this.processes = new Process[PROCESS_SIZE];
        this.readyQueue = new LinkedList<>();
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
        int choose = 0;
        while (choose < 3) {
            int index = random.nextInt(5);
            if (!processes[index].isUsing()) {
                processes[index].changeStatusReady();
                readyQueue.add(processes[index]);
                processes[index].changeUsing();
                choose++;
            }
        }

        for (Process p : processes) {
            System.out.println(p.toString());
        }

        System.out.println(readyQueue);
    }
}
