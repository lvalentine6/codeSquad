package mission4.problem3;

import java.util.HashMap;
import java.util.Map;

public class Originator {
    private int money;
    private Map<String, Integer> fruits;

    public Originator() {
        money = 1000;
        fruits = new HashMap<>();
    }

    public Memento createMemento() {
        return new Memento(money, fruits);
    }

    public void restoreMemento(Memento memento) {
        this.money = memento.getMoney();
        this.fruits = memento.getFruit();
    }

    public int getMoney() {
        return money;
    }

    public Map<String, Integer> getFruits() {
        return fruits;
    }
//
//    public void setMoney(int money) {
//        this.money = money;
//    }
//
//    public void setFruits(Map<String, Integer> fruits) {
//        this.fruits = fruits;
//    }

    public void plusMoney() {
        money += 100;
    }

    public void divideMoney() {
        money /= 2;
    }

    public void addFruit(String fruit) {
        fruits.put(fruit, fruits.getOrDefault(fruit, 0) + 1);
    }
}
