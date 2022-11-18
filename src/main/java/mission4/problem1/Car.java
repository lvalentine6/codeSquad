package mission4.problem1;

public class Car {
    private int carNumber;
    private static int serial = 1000;

    public Car() {
        carNumber = serial;
        serial++;
    }

    public int showCarNumber() {
        return carNumber;
    }
}
