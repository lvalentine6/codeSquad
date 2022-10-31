package misson1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

// 조건문 연습 7 - 주사위 세개

public class ThreeDice {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int answer = 0;
        Map<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < 3; i++) {
            int temp = Integer.parseInt(st.nextToken());
            hm.put(temp, hm.getOrDefault(temp, 0) + 1);
        }

        List<Integer> list = new ArrayList<>(hm.keySet());
        Collections.sort(list, (Comparator.comparingInt(hm::get)).reversed());

        if(hm.get(list.get(0)) == 3) {
            answer = 10000 + list.get(0) * 1000;
        } else if (hm.get(list.get(0)) == 2) {
            answer = 1000 + list.get(0) * 100;
        } else {
            Collections.sort(list, Collections.reverseOrder());
            answer = list.get(0) * 100;
        }

        System.out.println(answer);
    }
}
