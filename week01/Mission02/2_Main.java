import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Person p = new Person("제인");
        p.age = "30";
        p.gender = "여성";
        p.marriage = "기혼자";
        p.child = "1";

        System.out.println(p.showInfo());
    }

    public static class Person {
        String name, age, gender, marriage, child;

        public Person (String name) {
            this.name = name;
        }

        public String showInfo() {
            return "이름은 " + name + "이고 나이는 " + age + "살 입니다. 성별은 " + gender + "이며, " + marriage + " 입니다. 자녀는 "+ child + "명이 있습니다.";
        }

    }
}
