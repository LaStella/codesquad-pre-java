package week03.mission02;

public class Player {
    private PlayerLevel level;

    public Player() {
        this.level = new BeginnerLevel();
    }

    public void play(int time) {
        level.go(time);
    }

    public void upgradeLevel(PlayerLevel level) {
        this.level = level;
    }
}
