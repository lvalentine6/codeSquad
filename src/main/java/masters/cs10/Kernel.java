package masters.cs10;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Kernel {
    private PCB[] pcb;

    public void generateProcesses(Process[] processes) {
        char nameIndex = 'A';
        int maxOperatingTime = 0;

        for (int i = 0; i < 6; i++) {
            processes[i] = new Process(nameIndex++, 0, maxOperatingTime += 3, 0, "new");
        }
    }

    public void chooseProcess(Process[] processes, Queue<Process> readyQueue) {
        Random random = new Random();

        for (int i = 0; i < 3; i++) {
            int index = random.nextInt(6) + 1;
            processes[index].changeStatusReady();
            readyQueue.add(processes[index]);
        }
    }
}
