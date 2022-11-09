package algorithm2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Problem2Test {

    @Test
    void test1() {
        int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
        int[] moves = {1,5,3,5,1,2,1,4};

        Problem2 problem2 = new Problem2();
        assertEquals(problem2.solution(board, moves), 4);
    }
}