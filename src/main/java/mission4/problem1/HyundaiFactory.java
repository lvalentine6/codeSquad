package mission4.problem1;

import java.util.ArrayList;
import java.util.List;

public class HyundaiFactory {
    private List<Car> carList = new ArrayList<>();
    static int number = 1000;

    public static HyundaiFactory getFactory() {
        return new HyundaiFactory();
    }

    public Car createCar() {
        Car car = new Car(number++);
        carList.add(car);
        return car;
    }

    public List<Car> getCarList() {
        return carList;
    }
}
