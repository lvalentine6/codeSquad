package mission1.m1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 조건문 연습 3 - 윤년

public class LeapYear {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int year = Integer.parseInt(br.readLine());
        int answer = 0;

        if ((year % 4 == 0) && (year % 100 != 0)) {
            answer = 1;
        } else if ((year % 4 == 0) && (year % 400 == 0)) {
            answer = 1;
        }

        System.out.println(answer);
    }
}
