package practice.codingtest.baekjoon;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Boj2579_계단_오르기_Test {

    @Test
    void tc1() {
        Boj2579_계단_오르기.test(new int[]{10, 20, 15, 25, 10, 20});
    }

    @Test
    void tc2() {
        Boj2579_계단_오르기.test(new int[]{});
    }

}
