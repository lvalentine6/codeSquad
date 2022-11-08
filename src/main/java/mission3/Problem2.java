package mission3;

import java.util.ArrayList;
import java.util.List;

public class Problem2 {
    public static void main(String[] args) throws CloneNotSupportedException {
        List<Book> books = new ArrayList<>();
        books.add(new Book("태백산맥", "조정래"));
        books.add(new Book("이기적 유전자", "리처드 도킨즈"));
        books.add(new Book("자전거 도둑", "박완서"));
        books.add(new Book("토지", "박경리"));
        books.add(new Book("대변동", "제레드 다이아몬드"));

        // A_1 얕은 복사 진행
        List<Book> A_1 = new ArrayList<>(books);

        // 깊은 복사 테스트
        A_1.get(0).changeName("자바의 정석");

        // B 깊은 복사 진행
        List<Book> booksClone = new ArrayList<>();
        for (Book b : books) {
            booksClone.add((Book) b.clone());
        }

        // 책 목록 출력
        System.out.println("1. A 출력 : " + books);
        System.out.println("2. A_1 출력 : " + A_1);
        System.out.println("3. B 출력 : " + booksClone);

        // A, B 도서관 객체 생성
        Library A = new Library(books);
        Library B = new Library(booksClone);

        // 책 목록 변경
        A.getBook().get(2).changeName("그 많던 싱아는 누가 다 먹었을까");
        B.getBook().add(new Book("사피엔스", "유발 하라리"));

        // 도서관 책 목록 출력
        System.out.println();
        A.printBookList("A 도서관");
        B.printBookList("B 도서관");

    }
}
