package masters.cs11;

import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.CompletableFuture;

public class Cashier {
    public String[] orderList() {
        CompletableFuture<String> cashier = CompletableFuture.supplyAsync(() -> {
            Scanner scanner = new Scanner(System.in);
            String[] input = scanner.nextLine().split(":");
            System.out.println(Arrays.toString(input));
            return null;
        });
        return new String[0];
    }
}
