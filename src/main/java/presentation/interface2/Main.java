package presentation.interface2;

public class Main {
    public static void main(String[] args) {
        SportsCar car1 = new SportsCar();
        Car car2 = new SportsCar();

        // 참조변수와 인스턴스 타입이 일치
        car1.SecretFunction();
        // 상위 타입의 참조변수로 하위 타입의 인스턴스 참조 x
//        car2.SecretFunction();

        // 하위 타입으로 상위 타입 참조 x
        // 인스턴스의 Car의 맴버보다 SportsCar의 맴버가 더 많기 때문
//        SportsCar car3 = new Car();
    }
}
