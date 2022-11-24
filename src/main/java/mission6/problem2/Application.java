package mission6.problem2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Application {
    public static void main(String[] args) {
        Student student1 = new Student("강감찬", 211213, "국어국문학과", "국어", new SubjectScore("국어", 95, 56));
        Student student2 = new Student("김유신", 212330, "컴퓨터공학과", "수학", new SubjectScore("수학", 95, 98));
        Student student3 = new Student("신사임당", 201518, "국어국문학과", "국어", new SubjectScore("국어", 100, 88));
        Student student4 = new Student("이순신", 202360, "국어국문학과", "국어", new SubjectScore("국어", 89, 95));
        Student student5 = new Student("홍길동", 201290, "컴퓨터공학과", "수학", new SubjectScore("수학", 83, 56));

        Report report1 = new Report(student1);
        Report report2 = new Report(student2);
        Report report3 = new Report(student3);
        Report report4 = new Report(student4);
        Report report5 = new Report(student5);

        report1.printKoreanReportTop();
        report1.printKoreanReport();
        report2.printKoreanReport();
        report3.printKoreanReport();
        report4.printKoreanReport();
        report5.printKoreanReport();

        System.out.println();
        report1.printMathReportTop();
        report1.printMathReport();
        report2.printMathReport();
        report3.printMathReport();
        report4.printMathReport();
        report5.printMathReport();
    }
}
