package algorithm2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.text.ParseException;
import org.junit.jupiter.api.Test;
import preCourse.algorithm2.Problem5;

class Problem5Test {

    @Test
    void test1() throws ParseException {
        int a = 5;
        int b = 24;

        Problem5 problem5 = new Problem5();
        assertEquals(problem5.solution(5, 24), "TUE");

    }
}