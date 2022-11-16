package mission4.problem3;

public class Game {
    public static void main(String[] args) {
        int cnt = 0;
        GameManager gameManager = new GameManager();

        Originator gamer = gameManager.getGamer();
        Memento memento = gamer.createMemento();

        while (cnt <= 100 && gamer.getMoney() > 0) {
            int diceNumber = GameManager.getDiceNumber();
            String fruit = gameManager.getFruit(cnt);
            gameManager.playResult(fruit, diceNumber);

            if(gamer.getMoney() > memento.getMoney()) {
                System.out.println("복사 저장");
                memento = gamer.createMemento();
            } else if (gamer.getMoney() < memento.getMoney() / 2) {
                System.out.println("복사 복구");
                gamer.restoreMemento(memento);
            }

            gameManager.printCount(100 - cnt);
            gameManager.printGamerInfo();
            memento.printMemento();
            System.out.println();

            cnt++;
        }

    }
}
