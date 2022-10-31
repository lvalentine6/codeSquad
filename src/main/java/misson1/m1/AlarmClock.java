package misson1.m1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 조건문 연습 5 - 알람 시계

public class AlarmClock {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int hour = Integer.parseInt(st.nextToken());
        int minute = Integer.parseInt(st.nextToken());
        int time = 0;

        if(minute < 45) {
            hour--;
            minute = 60 - (45 - minute);
            if(hour < 0) {
                hour = 23;
            }
            sb.append(hour).append(" ").append(minute);
        } else {
            sb.append(hour).append(" ").append(minute - 45);
        }

        System.out.println(sb);
    }
}
