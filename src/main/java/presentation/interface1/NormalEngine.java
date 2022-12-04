package presentation.interface1;

public class NormalEngine implements Engine {

    @Override
    public void getEngine() {
        System.out.println("기본 엔진");
        System.out.println("1. 볼트 조이기");
        System.out.println("2. 너트 조이기");
        System.out.println("완성");
    }
}
