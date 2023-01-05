package masters.algorithm1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1009 {
    public static final int DIVIDE_NUMBER = 10;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();
        int T = Integer.parseInt(bufferedReader.readLine());

        for (int i = 0; i < T; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int a = Integer.parseInt(stringTokenizer.nextToken());
            int b = Integer.parseInt(stringTokenizer.nextToken());
            int data = 1;
            for (int j = 0; j < b; j++) {
                data = (data * a) % DIVIDE_NUMBER;
                if(data == 0) {
                    data = DIVIDE_NUMBER;
                }
            }
            stringBuilder.append(data).append("\n");
        }
        System.out.println(stringBuilder);
    }
}
