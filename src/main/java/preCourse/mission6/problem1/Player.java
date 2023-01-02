package preCourse.mission6.problem1;

public class Player {

    private PlayerLevel playerLevel;

    public Player(PlayerLevel playerLevel) {
        this.playerLevel = playerLevel;
    }

    public void play(int time) {
        playerLevel.go(time);
    }

    public void upgradeLevel(PlayerLevel playerLevel) {
        this.playerLevel = playerLevel;
    }
}

