package preCourse.mission4.problem3;

public class GameManager {
    private Originator gamer = new Originator();
    private String[] fruits = {"사과", "샤인머스킷", "귤"};

    public Originator getGamer() {
        return gamer;
    }

    public String getFruit(int i) {
        return fruits[i % fruits.length];
    }

    public static int getDiceNumber() {
        int number = (int) (Math.random() * 6) + 1;
        return number;
    }

    public void playResult(String fruit, int diceNumber) {
        if (diceNumber == 1 || diceNumber == 3) {
            gamer.plusMoney();
        } else if (diceNumber == 2 || diceNumber == 4) {
            gamer.divideMoney();
        } else if (diceNumber == 6) {
            gamer.addFruit(fruit);
        }
    }

    public void printGamerInfo() {
        System.out.println("유저 현재 남은 돈 : " + gamer.getMoney());
        System.out.println("유저 얻은 과일 : " + gamer.getFruits());
    }

    public void printCount(int cnt) {
        System.out.println("남은 턴 : " + cnt);
    }
}
