package preCourse.presentation.interface2;

public class Main {
    public static void main(String[] args) {
        // Car 타입 참조변수 참조
        Car car1 = new MiniCar();
        // 업캐스팅 1
        Car car2 = new MiniCar();
        // 업캐스팅 2
        Car car3 = new MiniCar();
        Car car4 = new SportsCar();

        // ....?
        Human roy = new Roy();

        // Car 인터페이스를 구현한 클래스라면 매개변수 사용가능
        roy.buyCar(car3);
        roy.buyCar(car4);

        // roy를 Roy 타입으로 다운캐스팅 후 Car 클래스의 인스턴스인 sportsCar를 반환
        Car car5 = ((Roy) roy).makeCar();
        car5.getCar();
    }
}
