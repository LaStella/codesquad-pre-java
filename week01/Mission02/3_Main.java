import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Person p1 = new Person("James", 5000);
        Person p2 = new Person("Tomas", 10000);

        Cafe c1 = new Cafe("별 다방");
        Cafe c2 = new Cafe("콩 다방");
        c1.americano = 1000;
        c2.latte = 5000;

        p1.getAmericano(c1);
        p2.getLatte(c2);
    }

    public static class Person {
        String name;
        int money;

        public Person (String name, int money) {
            this.name = name;
            this.money = money;
        }

        public void getAmericano (Cafe c) {
            money -= c.americano;
            System.out.println(name+"님의 남은 돈은 " + money + "원 입니다. " + c.name + "에서 아메리카노를 마셨습니다.");
        }

        public void getLatte (Cafe c) {
            money -= c.latte;
            System.out.println(name+"님의 남은 돈은 " + money + "원 입니다. " + c.name + "에서 라떼를 마셨습니다.");
        }
    }

    public static class Cafe {
        String name;
        int americano;
        int latte;

        public Cafe (String name) {
            this.name = name;
        }
    }
}
