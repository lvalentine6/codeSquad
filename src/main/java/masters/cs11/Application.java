package masters.cs11;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import preCourse.Test.Main;

public class Application {
    static Queue<Integer> orderQueue = new LinkedList<>();

    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
//            System.out.println("Return");
//            return "ParamReturn";
//        });
//        System.out.println(future.get());

        System.out.println("메뉴  =  1. 아메리카노(3s)    2. 카페라떼(5s)    3. 프라프치노(10s)");

        CompletableFuture<Void> cashier = CompletableFuture.runAsync(() -> {
            Scanner scanner = new Scanner(System.in);
            while (true) {
                System.out.println("주문할 음료를 입력하세요. 예) 아메리카노 2개 => 1:2");
                String[] input = scanner.nextLine().split(":");

                for (String s : input) {
                    orderQueue.add(Integer.parseInt(s));
                }

//                orderQueue.poll();
//                orderQueue.poll();

                if (orderQueue.isEmpty()) {
                    break;
                }
            }

//            try {
//                for (int i = 3; i > 0; i--) {
//                    System.out.println(i);
//                    Thread.sleep(1000);
//                }
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
        });
        CompletableFuture<Void> barista = CompletableFuture.runAsync(() -> {
            System.out.println("주문 받음");
        });

        CompletableFuture<Void> manager = CompletableFuture.runAsync(() -> {
            try {
                while (true) {
                    Thread.sleep(3000);
                    System.out.println("확인");
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        System.out.println(cashier.get());
    }
}