import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        for (int i = 1 ; i <= 9 ; i++) {
            for (int j = 1 ; j <= 9 ; j++) {
                System.out.printf("%4d", i*j);
            }
            System.out.println();
        }
    }
}