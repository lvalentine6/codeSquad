package masters.cs15;

public class OutputView {
    public void printHeader() {
        System.out.println("----------------------------");
        System.out.println("PC방 관리 프로그램을 시작합니다.");
        System.out.println("----------------------------");
    }

    public void printSeat() {
        System.out.println();
        System.out.println("빈 자리는 다음과 같습니다.");
    }

    public void printFooter() {
        System.out.println("----------------------------");
        System.out.println("프로그램을 종료합니다.");
        System.out.println("----------------------------");
    }
}
