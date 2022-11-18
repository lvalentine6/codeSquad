package algorithm2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Problem4 {
    public int[] solution(int[] answers) {
        int[] first = {1, 2, 3, 4, 5};
        int[] second = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] third = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] score = new int[3];

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == first[i % first.length]) {
                score[0]++;
            }
            if (answers[i] == second[i % second.length]) {
                score[1]++;
            }
            if (answers[i] == third[i % third.length]) {
                score[2]++;
            }
        }

        int max = Math.max(Math.max(score[0], score[1]), score[2]);

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < score.length; i++) {
            if (max == score[i]) {
                list.add(i + 1);
            }
        }

        Collections.sort(list);

        int[] answer = list.stream().mapToInt(i -> i).toArray();

        return answer;
    }
}
