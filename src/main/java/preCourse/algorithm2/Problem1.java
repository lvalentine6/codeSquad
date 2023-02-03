package preCourse.algorithm2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Problem1 {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                list.add(arr[i]);
            }
        }
        if (list.isEmpty()) {
            list.add(-1);
        }
        Collections.sort(list);

        int[] answer = list.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}
