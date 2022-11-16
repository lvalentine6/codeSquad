package mission4.problem3;

import java.util.Map;

public class Memento {
    private int money;
    private Map<String, Integer> fruits;

    public Memento(int money, Map<String, Integer> fruit) {
        this.money = money;
        this.fruits = fruit;
    }

    public int getMoney() {
        return money;
    }

    public Map<String, Integer> getFruit() {
        return fruits;
    }

    public void printMemento() {
        System.out.println("복사본 돈 : " + money);
        System.out.println("복사본 얻은 과일 : " + fruits);
    }
}
