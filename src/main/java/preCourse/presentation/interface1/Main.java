package preCourse.presentation.interface1;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car(new NormalEngine());
        car1.print();

        Car car2 = new Car(new SuperEngine());
        car2.print();
    }
}
