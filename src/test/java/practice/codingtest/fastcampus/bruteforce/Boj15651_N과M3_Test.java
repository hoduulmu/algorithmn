package practice.codingtest.fastcampus.bruteforce;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class Boj15651_N과M3_Test {

    @Test
    void tc1() {
        assertThat(new Boj15651_N과M3().solve(3, 1))
                .isEqualToIgnoringWhitespace("""
                        1
                        2
                        3
                        """);
    }

    @Test
    void tc2() {
        assertThat(new Boj15651_N과M3().solve(4, 2))
                .isEqualToIgnoringWhitespace("""
                        1 1
                         1 2
                         1 3
                         1 4
                         2 1
                         2 2
                         2 3
                         2 4
                         3 1
                         3 2
                         3 3
                         3 4
                         4 1
                         4 2
                         4 3
                         4 4
                        """);
    }

    @Test
    void tc3() {
        assertThat(new Boj15651_N과M3().solve(3, 3))
                .isEqualToIgnoringWhitespace("""
                        1 1 1
                            1 1 2
                            1 1 3
                            1 2 1
                            1 2 2
                            1 2 3
                            1 3 1
                            1 3 2
                            1 3 3
                            2 1 1
                            2 1 2
                            2 1 3
                            2 2 1
                            2 2 2
                            2 2 3
                            2 3 1
                            2 3 2
                            2 3 3
                            3 1 1
                            3 1 2
                            3 1 3
                            3 2 1
                            3 2 2
                            3 2 3
                            3 3 1
                            3 3 2
                            3 3 3
                        """);
    }
}
