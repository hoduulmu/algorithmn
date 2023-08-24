package org.example;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class _124_나라의_숫자_Test {

    @Test
    void tc1() {
        assertThat(new _124_나라의_숫자().solution(1)).isEqualTo("1");
    }

    @Test
    void tc2() {
        assertThat(new _124_나라의_숫자().solution(2)).isEqualTo("2");
    }

    @Test
    void tc3() {
        assertThat(new _124_나라의_숫자().solution(3)).isEqualTo("4");
    }

    @Test
    void tc4() {
        assertThat(new _124_나라의_숫자().solution(4)).isEqualTo("11");
    }

    @Test
    void tc5() {
        assertThat(new _124_나라의_숫자().solution(15)).isEqualTo("114");
    }

    @Test
    void tc6() {
        assertThat(new _124_나라의_숫자().solution(21)).isEqualTo("144");
    }
}
