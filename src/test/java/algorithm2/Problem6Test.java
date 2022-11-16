package algorithm2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.text.ParseException;
import org.junit.jupiter.api.Test;

class Problem6Test {

    @Test
    void test1() throws ParseException {
        int n = 12;

        Problem6 problem6 = new Problem6();
        assertEquals(problem6.solution(n), 28);

    }

    @Test
    void test2() throws ParseException {
        int n = 5;

        Problem6 problem6 = new Problem6();
        assertEquals(problem6.solution(n), 6);

    }
}