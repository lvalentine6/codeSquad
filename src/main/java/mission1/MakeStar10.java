package mission1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// 별찍기 10

public class MakeStar10 {
    static char[][] arr;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        arr = new char[n][n];

        // 배열을 빈칸으로 채우기
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = ' ';
            }
        }

        rec(0, 0, n);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sb.append(arr[i][j]);
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }

    static void rec(int x, int y, int num) {
        if (num == 1) {
            arr[x][y] = '*';
            return;
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (!(i == 1 && j == 1)) {
                    rec(x + i * (num / 3), y + j * (num / 3), num / 3);
                }
            }
        }

    }
}

