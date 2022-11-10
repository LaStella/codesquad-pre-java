import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static char[][] board;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        board = new char[N][N];

        printStar(0, 0, N);

        StringBuilder sb = new StringBuilder();

        for (int i = 0 ; i < N ; i++) {
            for (int j = 0 ; j < N ; j++) {
                sb.append(board[i][j]);
            }
            sb.append('\n');
        }

        System.out.println(sb);
    }

    public static void printStar(int r, int c, int n) {
        if (n == 1) {
            board[r][c] = '*';
        }

        else {
            int next_n = n/3;
            int count = 0;

            for (int i = r ; i < r+n ; i += next_n) {
                for (int j = c ; j < c+n ; j += next_n) {
                    count++;
                    if (count == 5) printBlank(i, j, next_n);
                    else printStar(i, j, next_n);
                }
            }
        }
    }

    public static void printBlank (int r, int c, int n) {
        for (int i = r ; i < r+n ; i++) {
            for (int j = c ; j < c+n ; j++) {
                board[i][j] = ' ';
            }
        }
    }
}