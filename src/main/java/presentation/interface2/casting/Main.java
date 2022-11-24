package presentation.interface2.casting;

import java.util.LinkedList;
import java.util.List;

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

        MiniCar miniCar = new MiniCar();

        // 하위 타입을 상위 타입으로 변환 (생략가능)
        Car casting1 = (Car) miniCar;
        // 상위 타입을 하위 타입으로 변환 (생략불가)
        Car casting2 = (MiniCar) casting1;
        // 상속관계가 아닌 클래스간 형변환 불가
//        SportsCar casting3 = (SportsCar) miniCar;

        List<String> list = new LinkedList<>();
        LinkedList<String> list2 = (LinkedList<String>) list;

        // 상위 타입인 List 참조변수로 하위타입에서 추가된 pysh() 메서드 사용불가
//        list.push();
        // 하위 타입으로 형변환 (다운캐스팅) 후 사용 가능
//        list2.push();


    }
}
