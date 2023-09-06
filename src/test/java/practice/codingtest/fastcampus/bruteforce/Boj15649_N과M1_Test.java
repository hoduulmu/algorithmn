package practice.codingtest.fastcampus.bruteforce;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Boj15649_N과M1_Test {

    @Test
    void tc1() {
        assertThat(new Boj15649_N과M1_Two_For_Loop().solve(3, 1))
                .isEqualToIgnoringWhitespace("""
                        1
                        2
                        3
                        """);
    }

    @Test
    void tc2() {
        assertThat(new Boj15649_N과M1_Two_For_Loop().solve(4, 2))
                .isEqualToIgnoringWhitespace("""
                        1 2
                            1 3
                            1 4
                            2 1
                            2 3
                            2 4
                            3 1
                            3 2
                            3 4
                            4 1
                            4 2
                            4 3
                        """);
    }

    @Test
    void tc3() {
        assertThat(new Boj15649_N과M1_Two_For_Loop().solve(4, 4))
                .isEqualToIgnoringWhitespace("""
                        1 2 3 4
                                 1 2 4 3
                                 1 3 2 4
                                 1 3 4 2
                                 1 4 2 3
                                 1 4 3 2
                                 2 1 3 4
                                 2 1 4 3
                                 2 3 1 4
                                 2 3 4 1
                                 2 4 1 3
                                 2 4 3 1
                                 3 1 2 4
                                 3 1 4 2
                                 3 2 1 4
                                 3 2 4 1
                                 3 4 1 2
                                 3 4 2 1
                                 4 1 2 3
                                 4 1 3 2
                                 4 2 1 3
                                 4 2 3 1
                                 4 3 1 2
                                 4 3 2 1
                        """);
    }

}
