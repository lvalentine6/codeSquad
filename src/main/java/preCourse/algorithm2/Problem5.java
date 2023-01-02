package preCourse.algorithm2;

import java.text.ParseException;
import java.time.LocalDate;

public class Problem5 {
    public String solution(int a, int b) throws ParseException {
        String answer = "";

        LocalDate date = LocalDate.of(2016, a, b);
        answer = date.getDayOfWeek().toString().substring(0, 3);

        return answer;
    }
}
