package preCourse.presentation.interface2;

public class Roy implements Human {

    @Override
    public void born() {
        System.out.println("로이가 태어남");
    }

    @Override
    public void buyCar(Car car) {
        System.out.println("로이가 차를 샀다!");
    }

    // 리턴타입이 인터페이스 -> 해당 인터페이스를 구현한 클래스의 인스턴스를 반환한다는것
    public Car makeCar() {
        return new SportsCar();
    }
}
