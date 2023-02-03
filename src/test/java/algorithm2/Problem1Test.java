package algorithm2;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;
import preCourse.algorithm2.Problem1;

public class Problem1Test {
    @Test
    void test1() {
        // given
        int[] arr = {5, 9, 7, 10};
        int divisor = 5;

        // when
        Problem1 problem1 = new Problem1();
        int[] answer = problem1.solution(arr, divisor);

        // then
        assertArrayEquals(answer, new int[]{5, 10});
    }

    @Test
    void test2() {
        // given
        int[] arr = {2, 36, 1, 3};
        int divisor = 1;

        // when
        Problem1 problem1 = new Problem1();
        int[] answer = problem1.solution(arr, divisor);

        // then
        assertArrayEquals(answer, new int[]{1, 2, 3, 36});
    }

    @Test
    void test3() {
        // given
        int[] arr = {3, 2, 5};
        int divisor = 10;

        // when
        Problem1 problem1 = new Problem1();
        int[] answer = problem1.solution(arr, divisor);

        // then
        assertArrayEquals(answer, new int[]{-1});
    }
}
