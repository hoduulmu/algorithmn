package practice.codingtest.fastcampus.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj15649_N과M1 {

    private static final StringBuilder sb = new StringBuilder();
    private int N, M;
    private int[] selected, used;

    public void input() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            StringTokenizer st = new StringTokenizer(br.readLine());
            setInput(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        } catch (IOException e) {
            throw new IllegalArgumentException();
        }
    }

    public void solve() {
        input();
        recurrenceFunction(0);
        System.out.println(sb);
    }

    public String solve(int n, int m) {
        setInput(n, m);
        recurrenceFunction(0);
        String answer = sb.toString();
        sb.setLength(0);
        return answer;
    }

    private void setInput(int n, int m) {
        N = n;
        M = m;
        selected = new int[M];
        used = new int[N];
    }

    private void recurrenceFunction(int k) {
        if (k == M) {
            for (int j : selected) {
                sb.append(j).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = 0; i < N; i++) {
            if (!isAlreadyContain(i + 1)) {
                selected[k] = i + 1;
                recurrenceFunction(k + 1);
                selected[k] = 0;
            }
        }
    }

    private boolean isAlreadyContain(int num) {
        for (int i : selected) {
            if (i == num) {
                return true;
            }
        }
        return false;
    }
}
