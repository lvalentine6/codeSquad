package presentation.interface2;

public class Main {
    public static void main(String[] args) {
        // Car 타입 참조변수 참조
        Car car1 = new MiniCar();
        // 업캐스팅 1
        Car car2 = (Car) new MiniCar();
        // 업캐스팅 2
        Car car3 = new MiniCar();
        Car car4 = new SportsCar();

        // ....?
        Roy roy = new Born();
        // 미니카
        roy.buyCar(car3);
        roy.buyCar(car4);

    }
}
