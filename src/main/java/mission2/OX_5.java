package mission2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OX_5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            int answer = cul(br.readLine());
            if(i != n) {
                sb.append(answer).append("\n");
                continue;
            }
            sb.append(answer);
        }
        System.out.println(sb);
    }

    static int cul(String str) {
        int sum = 0;
        int cnt = 0;
        String[] arr = str.split("");
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].equals("O")) {
                sum += ++cnt;
                continue;
            }
            cnt = 0;
            sum += cnt;
        }
        return sum;
    }
}
