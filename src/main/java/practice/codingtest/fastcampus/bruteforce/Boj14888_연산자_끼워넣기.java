package practice.codingtest.fastcampus.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj14888_연산자_끼워넣기 {

    private static final StringBuilder sb = new StringBuilder();
    private static int N;
    private static int[] numbers, operators;
    private static boolean[] isOperatorUsed;
    private static int min = Integer.MAX_VALUE;
    private static int max = Integer.MIN_VALUE;

    public static void main(String[] args) {
        solve();
    }

    public static void solve() {
        input();
        recurrenceFunction(0, new int[operators.length]);
        sb.append(max).append('\n').append(min);
        System.out.println(sb);
    }

    public static String solve(int n, String numberLine, String operatorLine) {
        setInput(n, numberLine, operatorLine);
        recurrenceFunction(0, new int[operators.length]);
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
        setOperators(N - 1, operatorLine);
    }

    private static void recurrenceFunction(int k, int[] candidate) {
        if (k == N - 1) {
            int result = calculate(candidate);
            if (result > max) max = result;
            if (result < min) min = result;
            return;
        }

        for (int i = 0; i < operators.length; i++) {
            if (isOperatorUsed[i]) continue;
            candidate[k] = operators[i];
            isOperatorUsed[i] = true;
            recurrenceFunction(k + 1, candidate);
            candidate[k] = 0;
            isOperatorUsed[i] = false;
        }
    }

    private static int calculate(int[] candidate) {
        int result = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            result = calculate(result, numbers[i], candidate[i - 1]);
        }
        return result;
    }

    private static int calculate(int first, int second, int operatorNum) {
        return switch (operatorNum) {
            case 1 -> first + second;
            case 2 -> first - second;
            case 3 -> first * second;
            case 4 -> first / second;
            default -> throw new IllegalArgumentException();
        };
    }

    private static void setOperators(int operatorsLength, String operatorLine) {
        operators = new int[operatorsLength];
        StringTokenizer st = new StringTokenizer(operatorLine);
        int opNum = 0;
        for (int i = 1; i < 5; i++) {
            int inputOpNum = Integer.parseInt(st.nextToken());
            for (int j = 0; j < inputOpNum; j++) {
                operators[opNum] = i;
                opNum += 1;
            }
        }
    }

    private static void setNumbers(int numbersLength, String numberLine) {
        numbers = new int[numbersLength];
        isOperatorUsed = new boolean[numbersLength - 1];
        StringTokenizer st = new StringTokenizer(numberLine);
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }
    }
}
