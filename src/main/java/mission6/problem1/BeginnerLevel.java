package mission6.problem1;

public class BeginnerLevel extends PlayerLevel {

    @Override
    void jump() {
        System.out.println("Jump 할 줄 모르지롱.");
    }

    @Override
    void run() {
        System.out.println("천천히 달립니다.");
    }

    @Override
    void turn() {
        System.out.println("Turn 할 줄 모르지롱.");
    }
}
