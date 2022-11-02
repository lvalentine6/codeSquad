package mission1.m2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 반복문 연습 1 - 별찍기 1

public class MakeStar1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());

        for (int i = 1; i <= a; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < i; j++) {
                sb.append("*");
            }
            System.out.println(sb);
        }
    }
}
