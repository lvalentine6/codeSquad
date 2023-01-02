package preCourse.mission6.problem2;

public class Student {
    private final String name;
    private final int number;
    private final String major;
    private final String majorSubject;
    private final SubjectScore subjectScore;

    public Student(String name, int number, String major, String majorSubject, SubjectScore subjectScore) {
        this.name = name;
        this.number = number;
        this.major = major;
        this.majorSubject = majorSubject;
        this.subjectScore = subjectScore;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public SubjectScore getSubjectScore() {
        return subjectScore;
    }

    public String getMajorSubject() {
        return majorSubject;
    }

}
