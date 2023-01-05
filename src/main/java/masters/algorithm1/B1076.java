package masters.algorithm1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class B1076 {
    public static void main(String[] args) throws IOException {
        List<String> list = new ArrayList<>();
        list.add("black");
        list.add("brown");
        list.add("red");
        list.add("orange");
        list.add("yellow");
        list.add("green");
        list.add("blue");
        list.add("violet");
        list.add("grey");
        list.add("white");

        Map<String, int[]> map = new HashMap<>();
        int multiple = 1;
        for (int i = 0; i < 9; i++) {
            map.put(list.get(i), new int[]{i, multiple});
            multiple *= 10;
        }

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String first = bufferedReader.readLine();
        String second = bufferedReader.readLine();
        String third = bufferedReader.readLine();
        int answer = 0;

        String temp = String.valueOf(map.get(first)[0]) + map.get(second)[0];
        answer = Integer.parseInt(temp) * map.get(third)[1];
        System.out.println(answer);
    }
}
