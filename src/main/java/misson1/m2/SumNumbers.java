package misson1.m2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 반복문 연습 2 - 숫자의 합

public class SumNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        String b = br.readLine();

        int sum = 0;
        String[] temp = b.split("");

        for (int i = 0; i < a; i++) {
            sum += Integer.parseInt(temp[i]);
        }

        System.out.println(sum);
    }
}
