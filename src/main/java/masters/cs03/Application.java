package masters.cs03;

import java.util.HashMap;

public class Application {
    public static void main(String[] args) {
        CPU cpu = new CPU();

        HashMap<String, Object> memory = new HashMap<>();
        memory.put("0000", "1011100010100000");   // MOV R4, 0x00A0
        memory.put("0010", "1011101000000010");   // MOV R5, 0x0002
        memory.put("0020", "0001001100000101");   // LOAD R1, R4, R5
        memory.put("0030", "1000010001100100");   // ADD R2, R1, #4
        memory.put("0040", "1001011001000010");   // SUB R3, R1, R2
        memory.put("0050", "0100011100100100");   // STORE R3, R4, #4

        memory.put("00A2", 5);
        memory.put("00A4", null);

    }
}
