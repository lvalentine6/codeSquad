package masters.cs10;

public class Application {
    public static final int PROCESS_SIZE = 6;

    public static void main(String[] args) {
        Process[] processes = new Process[PROCESS_SIZE];

        Kernel kernel = new Kernel(processes);
        OutputView outputView = new OutputView();

        outputView.printStart();
        kernel.generateProcesses();
        kernel.chooseProcess();
        outputView.printInit(processes);
        kernel.runProcesses();
//        outputView.printProgress(processes);

    }
}
