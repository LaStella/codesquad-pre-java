package week03.mission02;

public abstract class PlayerLevel {
    abstract void jump();

    abstract void run();

    abstract void turn();

    abstract void showLevelMessage();

    void go(int time) {
        showLevelMessage();
        run();
        for(int i =0; i < time; i++) {
            jump();
        }
        turn();
    }
}