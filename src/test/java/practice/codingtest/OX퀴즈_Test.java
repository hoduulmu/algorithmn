package practice.codingtest;

import org.junit.jupiter.api.Test;
import practice.codingtest.programmers.OX퀴즈;

import static org.assertj.core.api.Assertions.assertThat;

public class OX퀴즈_Test {

    @Test
    void tc1() {
        assertThat(new OX퀴즈().solution(new String[]{"3 - 4 = -3", "5 + 6 = 11"}))
                .isEqualTo(new String[]{"X", "O"});
    }

    @Test
    void tc2() {
        assertThat(new OX퀴즈().solution(new String[]{"19 - 6 = 13", "5 + 66 = 71", "5 - 15 = 63", "3 - 1 = 2"}))
                .isEqualTo(new String[]{"O", "O", "X", "O"});
    }
}
