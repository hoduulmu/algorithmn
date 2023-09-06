package practice.codingtest.fastcampus.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj15650_N과M2_Better {

    private static final StringBuilder sb = new StringBuilder();
    private static int N, M;
    private static int[] selected;

    public static void solve() {
        input();
        recurrenceFunction(0);
        System.out.println(sb);
    }

    public static String solve(int n, int m) {
        setInput(n, m);
        recurrenceFunction(0);
        String answer = sb.toString();
        sb.setLength(0);
        return answer;
    }

    private static void input() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            StringTokenizer st = new StringTokenizer(br.readLine());
            setInput(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        } catch (IOException e) {
            throw new IllegalArgumentException(e);
        }
    }

    private static void setInput(int n, int m) {
        N = n;
        M = m;
        selected = new int[M];
    }

    private static void recurrenceFunction(int k) {
        if (k == M) {
            for (int num : selected) {
                sb.append(num).append(' ');
            }
            sb.append('\n');
            return;
        }

        for (int i = k == 0 ? 0 : selected[k - 1]; i < N; i++) {
            selected[k] = i + 1;
            recurrenceFunction(k + 1);
            selected[k] = 0;
        }
    }
}
