import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        Object o = new Object();

        StringBuilder sb = new StringBuilder();
        sb.append(Operation.addNum(o.num1, o.num2)+"\n");
        sb.append(Operation.subNum(o.num1, o.num2)+"\n");
        sb.append(Operation.mulNum(o.num1, o.num2)+"\n");
        sb.append(Operation.divNum(o.num1, o.num2)+"\n");

        System.out.println(sb.toString());

    }

    public static class Object {
        int num1 = 10;
        int num2 = 2;
    }

    public static class Operation {
        public static int addNum(int num1, int num2) {
            return num1 + num2;
        }

        public static int subNum(int num1, int num2) {
            return num1 - num2;
        }

        public static int mulNum(int num1, int num2) {
            return num1 * num2;
        }

        public static int divNum(int num1, int num2) {
            return num1 / num2;
        }
    }
}
