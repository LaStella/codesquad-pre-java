package week02.mission02.three;

import java.util.*;

// Originator
public class Game {
    private int money;
    private List<String> fruits;
    private int fruitIndex;

    public Game() {
        fruits = new ArrayList<>();
        fruitIndex = 0;
    }

    public void restoreMemento(Memento m) {
        this.money = m.getMoney();
        this.fruits = m.getFruits();
    }

    public Memento saveMemento() {
        Memento m = Memento.getInstance();
        m.setMoney(money);
        m.setFruits(fruits);
        m.setFruitIndex(fruitIndex);
        return m;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void setFruitIndex(int fruitIndex) {
        this.fruitIndex = fruitIndex;
    }

    public void addFruit(String fruit) {
        this.fruits.add(fruit);
    }

    public void addMoney() {
        this.money += 100;
    }

    public void divideMoney() {
        this.money /= 2;
    }

    public int getMoney() {
        return this.money;
    }

    public List<String> getFruits() {
        return this.fruits;
    }

    public int getFruitIndex() {
        return this.fruitIndex;
    }

    public void showInfo() {
        System.out.println("현재 금액 : " + this.money + " / 현재 과일 : " + this.fruits.toString());
    }


}

