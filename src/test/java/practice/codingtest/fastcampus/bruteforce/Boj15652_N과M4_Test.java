package practice.codingtest.fastcampus.bruteforce;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Boj15652_N과M4_Test {

    @Test
    void tc1() {
        assertThat(Boj15652_N과M4.solve(3, 1))
                .isEqualToIgnoringWhitespace("""
                        1
                        2
                        3
                        """);
    }

    @Test
    void tc2() {
        assertThat(Boj15652_N과M4.solve(4, 2))
                .isEqualToIgnoringWhitespace("""
                               1 1
                               1 2
                               1 3
                               1 4
                               2 2
                               2 3
                               2 4
                               3 3
                               3 4
                               4 4
                        """);
    }

    @Test
    void tc3() {
        assertThat(Boj15652_N과M4.solve(3, 3))
                .isEqualToIgnoringWhitespace("""
                                        1 1 1
                                        1 1 2
                                        1 1 3
                                        1 2 2
                                        1 2 3
                                        1 3 3
                                        2 2 2
                                        2 2 3
                                        2 3 3
                                        3 3 3
                        """);
    }

    @Test
    void tc4() {
        assertThat(Boj15652_N과M4.solve(1, 1))
                .isEqualToIgnoringWhitespace("""
                        1
                        """);
    }
}
