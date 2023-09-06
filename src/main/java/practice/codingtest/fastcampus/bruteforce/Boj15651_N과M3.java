package practice.codingtest.fastcampus.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj15651_N과M3 {

    private int N;
    private int M;
    private int[] selected;
    private static final StringBuilder sb = new StringBuilder();

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
            selected[k] = i + 1;
            recurrenceFunction(k + 1);
            selected[k] = 0;
        }
    }
}
