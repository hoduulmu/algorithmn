package org.example;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class 과일_장수_Test {

    @Test
    void tc1() {
        assertThat(new 과일_장수().solution(3, 4, new int[]{1, 2, 3, 1, 2, 3, 1}))
                .isEqualTo(8);
    }

    @Test
    void tc2() {
        assertThat(new 과일_장수().solution(4, 3, new int[]{4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2}))
                .isEqualTo(33);
    }
}
