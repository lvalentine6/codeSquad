package presentation.Interface.InitializationBlock;

public class InitializationBlock {
    String name;

    static {
        System.out.println("클래스 초기화 블록");
    }

    {
        System.out.println("인스턴스 초기화 블록");
    }

    public InitializationBlock() {
        name = "인스턴스 이름";
    }

    public InitializationBlock(String name) {
        this.name = name;
    }
}
