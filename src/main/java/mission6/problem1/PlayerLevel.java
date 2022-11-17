package mission6.problem1;

public abstract class PlayerLevel {
    abstract void jump();

    abstract void run();

    abstract void turn();

    void showLevelMessage() {
    }

    void go(int time) {
        run();
        for (int i = 0; i < time; i++) {
            jump();
        }
        turn();
    }
}
