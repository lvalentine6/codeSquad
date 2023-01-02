package preCourse.mission4.problem2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // 학교 인스턴스 생성
        School school = new School();

        // 학생 추가
        school.resistStudent();

        // 파일 생성
        String fileName = makeFile();

        // 직렬화
        serialization(fileName, school);

        // 역직렬화
        School input = deserialization(fileName);

        // 파일 출력
        input.printList();

    }

    // 파일을 생성하고 파일 이름을 반환하는 메서드
    static String makeFile() {
        // 파일 인스턴스 생성
        File dir = new File(System.getProperty("user.dir") + "/src/main/resources/");
        File file = new File(dir, "input.txt");

        // 파일이 존재한다면
        if (file.exists()) {
            System.out.println("파일이 이미 존재합니다.");
            // 파일이 존재하지 않는다면
        } else {
            try {
                // 파일 실제 생성
                if (file.createNewFile()) {
                    System.out.println("파일 생성 성공");
                } else {
                    System.out.println("파일 생성 실패");
                }
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("파일 생성 실패");
            }
        }
        return file.getName();
    }

    // 객체 직렬화 후 쓰기
    static void serialization(String fileName, School school) throws IOException {
        // 직렬화
        FileOutputStream fileOutputStream = new FileOutputStream(fileName);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(school);
    }

    // 객체 역직렬화 후 읽기
    static School deserialization(String fileName) throws IOException, ClassNotFoundException {
        // 역직렬화
        FileInputStream fileInputStream = new FileInputStream(fileName);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        return (School) objectInputStream.readObject();
    }
}
