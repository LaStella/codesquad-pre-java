import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        if (a == b && a == c) System.out.println(10000 + a*1000);
        else {
            int pair = a == b ? a : b == c ? b : c == a ? c : -1;

            if (pair != -1) System.out.println(1000 + pair*100);
            else {
                int max = Math.max(a, Math.max(b, c));
                System.out.println(max*100);
            }
        }
    }
}