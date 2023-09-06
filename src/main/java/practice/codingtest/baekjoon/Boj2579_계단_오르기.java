package practice.codingtest.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Math.max;

public class Boj2579_계단_오르기 {

    private static int N, ans;
    private static int[] numbers, minus1MaxNums, minus2MaxNums;

    public static void main(String[] args) {
        input();
        solve();
        System.out.println(ans);
    }


    public static void input() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            N = Integer.parseInt(br.readLine());
            numbers = new int[N];
            minus1MaxNums = new int[numbers.length];
            minus2MaxNums = new int[numbers.length];
            for (int i = 0; i < N; i++) {
                numbers[i] = Integer.parseInt(br.readLine());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void solve() {
        if (N == 0) {
            return;
        }
        if (N == 1) {
            ans = numbers[0];
            return;
        }
        minus1MaxNums[0] = numbers[0];
        minus2MaxNums[0] = numbers[0];
        minus1MaxNums[1] = numbers[0] + numbers[1];
        minus2MaxNums[1] = numbers[1];

        for (int i = 2; i < numbers.length; i++) {
            minus1MaxNums[i] = minus2MaxNums[i - 1] + numbers[i];
            minus2MaxNums[i] = numbers[i] + max(minus1MaxNums[i - 2], minus2MaxNums[i - 2]);
        }

        ans = Math.max(minus1MaxNums[numbers.length - 1], minus2MaxNums[numbers.length - 1]);
    }

    public static void test(int[] inputNumbers) {
        numbers = inputNumbers;
        minus1MaxNums = new int[numbers.length];
        minus2MaxNums = new int[numbers.length];
        solve();
        System.out.println(ans);
    }
}
