package misson1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 조건문 연습 2 - 시험 성적

public class ExamScore {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int score = Integer.parseInt(br.readLine());
        String grade = "";

        if(score >= 90 && score <= 100) {
            grade = "A";
        } else if(score >= 80 && score < 90) {
            grade = "B";
        } else if (score >= 70 && score < 80) {
            grade = "C";
        } else if (score >= 60 && score < 70) {
            grade = "D";
        } else {
            grade = "F";
        }

        System.out.println(grade);
    }
}
