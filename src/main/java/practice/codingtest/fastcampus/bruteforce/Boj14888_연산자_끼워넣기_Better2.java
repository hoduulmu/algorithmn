package practice.codingtest.fastcampus.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj14888_연산자_끼워넣기_Better2 {

    private static final StringBuilder sb = new StringBuilder();
    private static int N;
    private static int[] numbers, operatorCounts;
    private static int min = Integer.MAX_VALUE;
    private static int max = Integer.MIN_VALUE;

    public static void main(String[] args) {
        solve();
    }

    public static void solve() {
        input();
        recurrenceFunction(0, numbers[0]);
        sb.append(max).append('\n').append(min);
        System.out.println(sb);
    }

    public static String solve(int n, String numberLine, String operatorLine) {
        setInput(n, numberLine, operatorLine);
        recurrenceFunction(0, numbers[0]);
        String result = sb.append(max).append('\n').append(min).toString();
        sb.setLength(0);
        return result;
    }

    private static void input() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            setInput(Integer.parseInt(br.readLine()), br.readLine(), br.readLine());
        } catch (IOException e) {
            throw new IllegalArgumentException(e);
        }
    }

    private static void setInput(int n, String numberLine, String operatorLine) {
        N = n;
        setNumbers(N, numberLine);
        setOperatorCounts(operatorLine);
    }

    private static void recurrenceFunction(int k, int value) {
        if (k == N - 1) {
            max = Math.max(max, value);
            min = Math.min(min, value);
            return;
        }

        for (int i = 0; i < operatorCounts.length; i++) {
            if (operatorCounts[i] == 0) continue;
            operatorCounts[i] -= 1;
            recurrenceFunction(k + 1, calculate(value, numbers[k + 1], i + 1));
            operatorCounts[i] += 1;
        }
    }

    private static int calculate(int first, int second, int operatorNum) {
        if (operatorNum == 1) {
            return first + second;
        }
        if (operatorNum == 2) {
            return first - second;
        }
        if (operatorNum == 3) {
            return first * second;
        }
        return first / second;
    }

    private static void setOperatorCounts(String operatorLine) {
        operatorCounts = new int[4];
        StringTokenizer st = new StringTokenizer(operatorLine);
        for (int i = 0; i < operatorCounts.length; i++) {
            operatorCounts[i] = Integer.parseInt(st.nextToken());
        }
    }

    private static void setNumbers(int numbersLength, String numberLine) {
        numbers = new int[numbersLength];
        StringTokenizer st = new StringTokenizer(numberLine);
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }
    }
}
