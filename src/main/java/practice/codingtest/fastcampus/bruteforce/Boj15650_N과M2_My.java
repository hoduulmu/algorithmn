package practice.codingtest.fastcampus.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj15650_N과M2 {

    private static final StringBuilder sb = new StringBuilder();
    private static int N, M;
    private static int[] selected, used;

    public static void solve() {
        input();
        recurrenceFunction(0, 0);
        System.out.println(sb);
    }

    public static String solve(int n, int m) {
        setInput(n, m);
        recurrenceFunction(0, 0);
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
        used = new int[N];
    }

    private static void recurrenceFunction(int k, int p) {
        if (k == M) {
            for (int num : selected) {
                sb.append(num).append(' ');
            }
            sb.append('\n');
            return;
        }

        for (int i = p; i < N; i++) {
            if (used[i] != 1) {
                selected[k] = i + 1;
                used[i] = 1;
                recurrenceFunction(k + 1, i);
                selected[k] = 0;
                used[i] = 0;
            }
        }
    }
}
