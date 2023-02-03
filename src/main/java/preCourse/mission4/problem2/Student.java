package preCourse.mission4.problem2;

public class Student implements java.io.Serializable {

    private final String name;
    private final int classOfNumber;
    private final String major;
    private final int koreanScore;
    private final int mathScore;
    private final int englishScore;

    public Student(String name, Integer classOfNumber, String major, Integer koreanScore, Integer mathScore,
                   Integer englishScore) {
        this.name = name;
        this.classOfNumber = classOfNumber;
        this.major = major;
        this.koreanScore = koreanScore;
        this.mathScore = mathScore;
        this.englishScore = englishScore;
    }

    public String getName() {
        return name;
    }

    int countSubject() {
        int cnt = 0;
        if (koreanScore != 0) {
            cnt++;
        }
        if (mathScore != 0) {
            cnt++;
        }
        if (englishScore != 0) {
            cnt++;
        }
        return cnt;
    }

    int totalScore() {
        return koreanScore + mathScore + englishScore;
    }

    int averageScore() {
        return (koreanScore + mathScore + englishScore) / 3;
    }

    String studentInfo() {
        String sb = name
                + " 학생은 "
                + countSubject()
                + "과목을 수강했습니다."
                + "\n"
                + "총점은 "
                + totalScore()
                + "점이고 "
                + "평균은 "
                + averageScore()
                + "입니다."
                + "\n";
        return sb;
    }
}
