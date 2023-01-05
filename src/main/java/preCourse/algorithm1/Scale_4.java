package preCourse.algorithm1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

// 1. 확장성 고려하기
// 2. 메서드 기능별로 분리 해보기

public class Scale_4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String answer = "";
        List<Integer> list = new ArrayList<>();

        while (st.hasMoreTokens()) {
            list.add(Integer.parseInt(st.nextToken()));
        }

        if (checkAsc(list)) {
            answer = "ascending";
        }

        if (checkDesc(list)) {
            answer = "descending";
        }

        if (!checkAsc(list) && !checkDesc(list)) {
            answer = "mixed";
        }

        System.out.println(answer);
    }

    static boolean checkAsc(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) != i + 1) {
                return false;
            }
        }
        return true;
    }

    static boolean checkDesc(List<Integer> list) {
        int temp = list.size();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) != temp) {
                return false;
            }
            temp--;
        }
        return true;
    }
}
