package mission6.problem2;

public class Report {
    private final Student student;
    private StringBuilder sb;

    public Report(Student student) {
        this.student = student;
    }

    public void printKoreanReportTop() {
        String sb = "---------------------------------------"
                + "\n"
                + "          국어 수강생 학점"
                + "\n"
                + "이름  |   학번   |  중점과목  | 점수"
                + "\n"
                + "---------------------------------------";
        System.out.println(sb);
    }

    public void printKoreanReport() {
        sb = new StringBuilder();
        sb.append(student.getName())
                .append(" |  ")
                .append(student.getNumber())
                .append("  |   ")
                .append(student.getSubjectScore().getMajorSubject())
                .append("   |  ")
                .append(student.getSubjectScore().getKorean())
                .append(":")
                .append(student.getSubjectScore().getKoreanGrade())
                .append("\n")
                .append("---------------------------------------");
        System.out.println(sb);
    }

    public void printMathReportTop() {
        String sb = "---------------------------------------"
                + "\n"
                + "          수학 수강생 학점"
                + "\n"
                + "이름  |   학번   |  중점과목  | 점수"
                + "\n"
                + "---------------------------------------";
        System.out.println(sb);
    }

    public void printMathReport() {
        sb = new StringBuilder();
        sb.append(student.getName())
                .append(" |  ")
                .append(student.getNumber())
                .append("  |   ")
                .append(student.getSubjectScore().getMajorSubject())
                .append("   |  ")
                .append(student.getSubjectScore().getMath())
                .append(":")
                .append(student.getSubjectScore().getMathGrade())
                .append("\n")
                .append("---------------------------------------");
        System.out.println(sb);
    }
}
