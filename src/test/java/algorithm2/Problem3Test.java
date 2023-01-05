package algorithm2;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;
import preCourse.algorithm2.Problem3;

class Problem3Test {

    @Test
    void test1() {
        int[] numbers = {2, 1, 3, 4, 1};

        Problem3 problem3 = new Problem3();

        assertArrayEquals(problem3.solution(numbers), new int[]{2, 3, 4, 5, 6, 7});
    }

    @Test
    void test2() {
        int[] numbers = {5, 0, 2, 7};

        Problem3 problem3 = new Problem3();

        assertArrayEquals(problem3.solution(numbers), new int[]{2, 5, 7, 9, 12});
    }
}