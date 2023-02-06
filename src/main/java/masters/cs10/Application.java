package masters.cs10;

import java.util.LinkedList;
import java.util.Queue;

public class Application {
    public static void main(String[] args) {
        Kernel kernel = new Kernel();

        kernel.generateProcesses();
        kernel.chooseProcess();

    }
}
