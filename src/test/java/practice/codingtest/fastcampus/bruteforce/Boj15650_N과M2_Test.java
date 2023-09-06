package practice.codingtest.fastcampus.bruteforce;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Boj15650_N과M2_Test {

    @Test
    void tc1() {
        assertThat(Boj15650_N과M2_Better.solve(3, 1))
                .isEqualToIgnoringWhitespace("""
                        1
                        2
                        3
                        """);
    }

    @Test
    void tc2() {
        assertThat(Boj15650_N과M2_Better.solve(4, 2))
                .isEqualToIgnoringWhitespace("""
                            1 2
                            1 3
                            1 4
                            2 3
                            2 4
                            3 4
                        """);
    }

    @Test
    void tc3() {
        assertThat(Boj15650_N과M2_Better.solve(4, 4))
                .isEqualToIgnoringWhitespace("""
                                        1 2 3 4
                        """);
    }
}
