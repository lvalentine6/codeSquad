package preCourse.algorithm3;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

class problem1 {
    static final int CHECK_NUMBER = 5;
    static final int CHECK_GRADE = 40;
    static final int CHECK_ROUND = 3;
    static List<Integer> answer = new ArrayList<>();

    public static List<Integer> gradingStudents(List<Integer> grades) {
        for (int i = 0; i < grades.size(); i++) {
            int nowNumber = grades.get(i);
            int nextNumber = multipleNumber(nowNumber);
            boolean flag = checkFailGrade(nextNumber);
            if(flag) {
                answer.add(nowNumber);
                continue;
            }
            nowNumber = roundNumber(nowNumber, nextNumber);
            answer.add(nowNumber);
        }
        return answer;
    }

    public static int roundNumber(int nowNumber, int nextNumber) {
        if(nextNumber - nowNumber < 3) {
            return nextNumber;
        }
        return nowNumber;
    }

    public static boolean checkFailGrade(int nextNumber) {
        if(nextNumber < CHECK_GRADE) {
            return true;
        }
        return false;
    }

    public static int multipleNumber(int n) {
        int share = n / CHECK_NUMBER;
        int rest = n % CHECK_NUMBER;
        if(rest != 0) {
            return CHECK_NUMBER * (share + 1);
        }
        return n;
    }

}

class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int gradesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> grades = IntStream.range(0, gradesCount).mapToObj(i -> {
                    try {
                        return bufferedReader.readLine().replaceAll("\\s+$", "");
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                })
                .map(String::trim)
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> result = problem1.gradingStudents(grades);

        bufferedWriter.write(
                result.stream()
                        .map(Object::toString)
                        .collect(joining("\n"))
                        + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}

