package practice.codingtest;

import practice.codingtest.programmers.배열의_길이에_따라_다른_연산하기;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class 배열의_길이에_따라_다른_연산하기_Test {

    @Test
    void tc1() {
        assertThat(new 배열의_길이에_따라_다른_연산하기().solution(new int[]{49, 12, 100, 276, 33}, 27))
                .isEqualTo(new int[]{76, 12, 127, 276, 60});
    }

    @Test
    void tc2() {
        assertThat(new 배열의_길이에_따라_다른_연산하기().solution(new int[]{444, 555, 666, 777}, 100))
                .isEqualTo(new int[]{444, 655, 666, 877});
    }
}
