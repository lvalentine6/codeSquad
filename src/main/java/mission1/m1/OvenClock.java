package mission1.m1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 조건문 연습 6 - 오븐 시계

public class OvenClock {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int time = Integer.parseInt(br.readLine());

        int temp = 60 * h + m;
        temp += time;

        int hour = (temp / 60) % 24;
        int minute = temp % 60;

        sb.append(hour).append(" ").append(minute);

        System.out.println(sb);
    }
}
