package preCourse.mission4.problem2;

import java.util.ArrayList;
import java.util.List;

public class School implements java.io.Serializable {
    private List<Student> studentList;
    private static Integer classOfNumber = 1000;

    public void resistStudent() {
        studentList = new ArrayList<>();
        studentList.add(new Student("kim", classOfNumber++, "수학", 100, 100, 0));
        studentList.add(new Student("Lee", classOfNumber++, "국어", 55, 55, 100));
    }

    public void printList() {
        for (Student list : studentList) {
            System.out.println(list.studentInfo());
        }
    }
}
