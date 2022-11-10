package week01.mission02_addition.one;

import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("수학, 과학, 영어 순으로 3개의 정수 입력 >> ");
        int mathScore = scanner.nextInt();
        int scienceScore = scanner.nextInt();
        int englishScore = scanner.nextInt();

        Grade me = new Grade(mathScore, scienceScore, englishScore);
        System.out.println("평균은 " + me.scoreAverage());

        scanner.close();
    }
}