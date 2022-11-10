import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Person p1 = new Person("James", 5000);
        Person p2 = new Person("Tomas", 10000);

        Map<String, Cafe> cafeMap = new HashMap<>();
        for (Cafe c : Cafe.values()) {
            cafeMap.put(c.name, c);
        }
        p1.getCoffee(cafeMap.get("별"), "아메리카노");
        p2.getCoffee(cafeMap.get("콩"), "라떼");
    }


    public static class Person {
        String name;
        int money;

        public Person (String name, int money) {
            this.name = name;
            this.money = money;
        }

        public void getCoffee(Cafe c, String coffee) {
            money -= c.menu.get(coffee);
            System.out.println(name + "님의 남은 돈은 " + money + "원 입니다. " + c.name + " 다방에서 " + coffee + "를 마셨습니다.");
        }
    }

    public enum Cafe {
        BYEOL("별", Map.ofEntries(Map.entry("아메리카노", 4000))),
        KONG("콩", Map.ofEntries(Map.entry("라떼", 5000)));

        String name;
        Map<String, Integer> menu;

        Cafe(String name, Map<String, Integer> menu) {
            this.name = name;
            this.menu = menu;
        }
    }
}
