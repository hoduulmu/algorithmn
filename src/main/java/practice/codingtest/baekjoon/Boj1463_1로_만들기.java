package practice.codingtest.baekjoon;

import java.util.Map;

public class Boj1463_1로_만들기 {

    private static int ans = 0;
    private static Map<Integer, Integer> calMap = Map.of(10, 3, 9, 2, 8, 3);

    public static void solve(int n) {
        while (n > 1) {

            if (n % 10 == 0) {
                n /= 10;
                ans += 3;
                continue;
            }

            if (n % 9 == 0) {
                n /= 9;
                ans += 2;
                continue;
            }

            if (n % 8 == 0) {
                n /= 8;
                ans += 2;
                continue;
            }

            if (n % 7 == 0) {
                n /= 7;
                ans += 2;
                continue;
            }

            if (n % 6 == 0) {
                n /= 6;
                ans += 2;
                continue;
            }

            if (n % 5 == 0) {
                n /= 5;
                ans += 2;
                continue;
            }

            if (n % 4 == 0) {
                n /= 4;
                ans += 2;
                continue;
            }

            if (n <= 3) {
                ans += 1;
                break;
            }

            n -= 1;
            ans += 1;
        }
        System.out.println(ans);
    }
}
