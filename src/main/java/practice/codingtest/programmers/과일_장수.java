package org.example;

import java.util.Arrays;

public class 과일_장수 {

    public int solution(int k, int m, int[] score) {
        int answser = 0;
        Arrays.sort(score);
        for (int i = score.length - m; i >= 0; i -= m) {
            answser += score[i] * m;
        }
        return answser;
    }
}
