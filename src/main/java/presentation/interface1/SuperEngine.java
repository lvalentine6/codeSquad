package presentation.interface1;

public class SuperEngine implements Engine{

    @Override
    public void getEngine() {
        System.out.println("슈퍼 엔진");
        System.out.println("1. 볼트 조이기");
        System.out.println("2. 너트 조이기");
        System.out.println("3. UFO 부품 넣기");
        System.out.println("완성");
    }
}
