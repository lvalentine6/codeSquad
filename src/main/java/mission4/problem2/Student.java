package mission4.problem2;

public class Student implements java.io.Serializable {

    private String name;
    private int classOfNumber;
    private String major;
    private int koreanScore;
    private int mathScore;
    private int englishScore;

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
        StringBuilder sb = new StringBuilder();
        sb.append(name)
                .append(" 학생은 ")
                .append(countSubject())
                .append("과목을 수강했습니다.")
                .append("\n")
                .append("총점은 ")
                .append(totalScore())
                .append("점이고 ")
                .append("평균은 ")
                .append(averageScore())
                .append("입니다.")
                .append("\n");
        return sb.toString();
    }
}
