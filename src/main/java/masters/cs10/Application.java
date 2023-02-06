package masters.cs10;

public class Application {
    public static final int PROCESS_SIZE = 6;

    public static void main(String[] args) {
        PCB[] pcb = new PCB[PROCESS_SIZE];
        Process[] processes = new Process[PROCESS_SIZE];

        Kernel kernel = new Kernel(pcb, processes);
        OutputView outputView = new OutputView();

        kernel.generateProcesses();
        kernel.chooseProcess();
        outputView.printProgressInit(processes);
//        outputView.printProgress(processes);

    }
}
