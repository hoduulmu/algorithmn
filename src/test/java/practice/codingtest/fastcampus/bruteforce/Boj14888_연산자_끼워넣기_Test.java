package practice.codingtest.fastcampus.bruteforce;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Boj14888_연산자_끼워넣기_Test {


    @Test
    void tc1() {
        assertThat(Boj14888_연산자_끼워넣기_Better2.solve(2, "5 6", "0 0 1 0"))
                .isEqualToIgnoringWhitespace("""
                        30
                        30
                        """);
    }

    @Test
    void tc2() {
        assertThat(Boj14888_연산자_끼워넣기_Better2.solve(3, "3 4 5", "1 0 1 0"))
                .isEqualToIgnoringWhitespace("""
                        35
                        17
                        """);
    }

    @Test
    void tc3() {
        assertThat(Boj14888_연산자_끼워넣기_Better2.solve(6, "1 2 3 4 5 6", "2 1 1 1"))
                .isEqualToIgnoringWhitespace("""
                        54
                        -24
                        """);
    }

}
