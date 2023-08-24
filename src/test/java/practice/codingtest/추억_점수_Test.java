package org.example;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class 추억_점수_Test {

    @Test
    void tc1() {
        assertThat(new 추억_점수().solutionUseForLoop(
                new String[]{"may", "kein", "kain", "radi"},
                new int[]{5, 10, 1, 3},
                new String[][]{{"may", "kein", "kain", "radi"},{"may", "kein", "brin", "deny"}, {"kon", "kain", "may", "coni"}}
                ))
                .isEqualTo(new int[]{19, 15, 6});
    }

    @Test
    void tc2() {
        assertThat(new 추억_점수().solutionUseForLoop(
                new String[]{"kali", "mari", "don"},
                new int[]{11, 1, 55},
                new String[][]{{"kali", "mari", "don"}, {"pony", "tom", "teddy"}, {"con", "mona", "don"}}
        ))
                .isEqualTo(new int[]{67, 0, 55});
    }

    @Test
    void tc3() {
        assertThat(new 추억_점수().solutionUseForLoop(
                new String[]{"may", "kein", "kain", "radi"},
                new int[]{5, 10, 1, 3},
                new String[][]{{"may"},{"kein", "deny", "may"}, {"kon", "coni"}}
        ))
                .isEqualTo(new int[]{5, 15, 0});
    }
}
