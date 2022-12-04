package Test;

public class Main {
    public static void main(String[] args) {
        int drink = 50;
        Alice alice = new Alice(150, drink);
        Beverage beverage = new Beverage(100);

        alice.drinkBeverage();
        beverage.drunken(drink);

    }
}