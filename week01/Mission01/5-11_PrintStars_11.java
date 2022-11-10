
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static char[][] board;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        board = new char[N][2*N-1];
        for (int i = 0 ; i < N ; i++) {
            Arrays.fill(board[i], ' ');
        }

        // 별의 위 꼭지점에서 시작
        printStar(0, N-1, N);

        StringBuilder sb = new StringBuilder();

        for (int i = 0 ; i < N ; i++) {
            for (int j = 0 ; j < 2*N-1 ; j++) {
                sb.append(board[i][j]);
            }
            sb.append('\n');
        }

        System.out.println(sb);
    }

    // 별을 board에 저장하는 함수입니다.
    public static void printStar(int r, int c, int n) {
        // 길이가 3인 삼각형이라면 별을 저장합니다.
        if (n == 3) {
            board[r][c] = '*';
            board[r+1][c-1] = '*';
            board[r+1][c+1] = '*';
            for (int i = c-2 ; i <= c+2 ; i++) {
                board[r+2][i] = '*';
            }
            return;
        }

        // 길이가 3이 아닌 삼각형은 길이가 3이 될 때까지 쪼개어 별을 출력합니다.
        int next_n = n/2;
        // 하나의 큰 삼각형은 작은 3개의 삼각형으로 쪼갤 수 있습니다.
        printStar(r, c, next_n);
        printStar(r + next_n, c - next_n, next_n);
        printStar(r + next_n, c + next_n, next_n);
    }
}