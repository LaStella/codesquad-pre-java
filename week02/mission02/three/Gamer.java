package week02.mission02.three;

import java.util.*;

// Caretaker
public class Gamer {
    static String[] fruit = {"사과", "샤인머스켓", "귤"};
    public static void main(String[] args) {
        int gameCount = 1;
        Game game = new Game();

        game.setMoney(1000);

        while (gameCount < 101 || game.getMoney() <= 0) {
            int diceNum = new Random().nextInt(6)+1;
            // 주사위가 1, 3이 나오면 게이머의 돈을 100 증가시킵니다.
            if (diceNum == 1 || diceNum == 3) game.addMoney();
            // 주사위가 2, 4가 나오면 게이머의 돈이 반으로 줄어듭니다.
            if (diceNum == 2 || diceNum == 4) game.divideMoney();
            // 주사위가 6이 나오면 게이머는 과일 중 하나를 받습니다. (순차적으로)
            if (diceNum == 6) {
                int fruitIndex = game.getFruitIndex();
                if (fruitIndex > 2) continue;
                game.addFruit(fruit[fruitIndex]);
                game.setFruitIndex(++fruitIndex);
            }

            // 현재 게임에서 게이머의 돈이 저장되어있는 Memento보다 늘어나면 현재 게임의 상태를 Memento에 저장합니다.
            if (game.getMoney() > Memento.getInstance().getMoney()) {
                game.saveMemento();
            }

            // 현재 게임에서 게이머의 돈이 저장되어있는 Memento의 돈의 절반보다 작으면 Memento의 상태로 게임을 불러옵니다.
            if (game.getMoney() < Memento.getInstance().getMoney()/2) {
                game.restoreMemento(Memento.getInstance());
            }

            // 게임 번호와 현재 게임에서 게이머의 상태를 출력합니다.
            System.out.print(gameCount++ + "번 게임 / ");
            game.showInfo();
        }
    }
}
