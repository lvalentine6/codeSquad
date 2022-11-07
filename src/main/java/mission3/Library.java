package mission3;

import java.util.List;

public class Library {
    private List<Book> book;

    public Library(List<Book> book) {
        this.book = book;
    }

    public List<Book> getBook() {
        return book;
    }

    public void printBookList(String name) {
        System.out.println(name + " 책 목록");
        System.out.println("-----------------------");
        for (int i = 0; i < getBook().size(); i++) {
            System.out.println(getBook().get(i).getName() + " : " + getBook().get(i).getAuthor());
        }
        System.out.println("-----------------------");
    }
}
