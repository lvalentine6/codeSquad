package mission6.problem2;

public class SubjectScore {
    private final String majorSubject;
    private final int korean;
    private final String koreanGrade;
    private final int math;
    private final String mathGrade;
    private GradeEvaluation gradeEvaluation;

    public SubjectScore(String majorSubject, int korean, int math) {
        this.majorSubject = majorSubject;
        this.korean = korean;
        this.koreanGrade = getKoreanGrade();
        this.math = math;
        this.mathGrade = getMathGrade();
    }

    public int getKorean() {
        return korean;
    }

    public int getMath() {
        return math;
    }

    public String getMajorSubject() {
        return majorSubject;
    }

    public String getKoreanGrade() {
        if (majorSubject.equals("국어")) {
            gradeEvaluation = new MajorEvaluation();
            return gradeEvaluation.getGrade(korean);
        }
        gradeEvaluation = new BasicEvaluation();
        return gradeEvaluation.getGrade(korean);
    }

    public String getMathGrade() {
        if (majorSubject.equals("수학")) {
            gradeEvaluation = new MajorEvaluation();
            return gradeEvaluation.getGrade(math);
        }
        gradeEvaluation = new BasicEvaluation();
        return gradeEvaluation.getGrade(math);
    }
}
