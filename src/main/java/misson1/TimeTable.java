package misson1;

// 과제 1 - 구구단

public class TimeTable {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println();
        }
    }
}
