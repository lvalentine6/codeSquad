package algorithm2;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;
import preCourse.algorithm2.Problem4;

class Problem4Test {

    @Test
    void test1() {
        int[] answers = {1, 2, 3, 4, 5};
        Problem4 problem4 = new Problem4();

        assertArrayEquals(problem4.solution(answers), new int[]{1});
    }

    @Test
    void test2() {
        int[] answers = {1, 3, 2, 4, 2};
        Problem4 problem4 = new Problem4();

        assertArrayEquals(problem4.solution(answers), new int[]{1, 2, 3});
    }

}