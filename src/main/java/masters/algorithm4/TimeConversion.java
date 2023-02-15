package masters.algorithm4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class Result1 {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
        String temp = s.substring(s.length() - 2);
        s = s.substring(0, s.length() - 2);
        String[] split = s.split(":");
        int n = Integer.parseInt(split[0]);

        if (temp.equals("PM")) {
            if (n != 12) {
                n += 12;
            }

            if (n < 10) {
                split[0] = "0" + n;
            } else {
                split[0] = String.valueOf(n);
            }
        } else {
            if (n == 12) {
                n = 00;
            }

            if (n < 10) {
                split[0] = "0" + n;
            } else {
                split[0] = String.valueOf(n);
            }
        }

        System.out.println(Arrays.toString(split));

        String answer = "";
        for (String str : split) {
            answer += str + ":";
        }

        answer = answer.substring(0, answer.length() - 1);

        return answer;
    }

}

public class TimeConversion {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result1.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

