package week02.mission02.three;

import java.util.*;

public class Memento {
    int money;
    List<String> fruits;
    int fruitIndex;
    private static Memento m;

    private Memento() {
    }

    public static Memento getInstance() {
        if (m == null) {
            m = new Memento();
        }

        return m;
    }
    public void setMoney(int money) {
        this.money = money;
    }

    public void setFruits(List<String> fruits) {
        this.fruits = fruits;
    }

    public void setFruitIndex(int fruitIndex) {
        this.fruitIndex = fruitIndex;
    }

    public int getMoney() {
        return money;
    }

    public List<String> getFruits() {
        return fruits;
    }
}