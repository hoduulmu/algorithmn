package practice.codingtest.programmers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class 로또의_최고_순위와_최저_순위_Test {

    @Test
    void tc1() {
        assertThat(new 로또의_최고_순위와_최저_순위().solution(new int[]{44, 1, 0, 0, 31, 25}, new int[]{31, 10, 45, 1, 6, 19}))
                .isEqualTo(new int[]{3, 5});
    }

    @Test
    void tc2() {
        assertThat(new 로또의_최고_순위와_최저_순위().solution(new int[]{0, 0, 0, 0, 0, 0}, new int[]{38, 19, 20, 40, 15, 25}))
                .isEqualTo(new int[]{1, 6});
    }

    @Test
    void tc3() {
        assertThat(new 로또의_최고_순위와_최저_순위().solution(new int[]{45, 4, 35, 20, 3, 9}, new int[]{20, 9, 3, 45, 4, 35}))
                .isEqualTo(new int[]{1, 1});
    }

}
