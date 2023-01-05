package preCourse.Test;

public class Alice {
    private int hight;
    private int drink;

    public Alice(int hight, int drink) {
        this.hight = hight;
        this.drink = drink;
    }

    public void drinkBeverage() {
        drink += 50;
        hight += 50;
    }
}
