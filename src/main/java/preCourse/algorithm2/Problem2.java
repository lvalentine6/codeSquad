package preCourse.algorithm2;

import java.util.Stack;

public class Problem2 {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> st = new Stack<>();

        int[][] temp = new int[board.length][board[0].length];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                temp[i][j] = board[j][i];
            }
        }

        for (int i = 0; i < moves.length; i++) {
            for (int j = 0; j < temp[0].length; j++) {
                if (temp[moves[i] - 1][j] == 0) {
                    continue;
                } else {
                    if (!st.isEmpty() && temp[moves[i] - 1][j] == st.peek()) {
                        answer += 2;
                        st.pop();
                    } else {
                        st.add(temp[moves[i] - 1][j]);
                    }
                    temp[moves[i] - 1][j] = 0;
                    break;
                }
            }
        }
        return answer;
    }
}
