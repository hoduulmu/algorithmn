package org.example;

import java.util.stream.IntStream;

public class 배열의_길이에_따라_다른_연산하기 {

    public int[] solution(int[] arr, int n) {
        int arrLength = arr.length;
        boolean isArrLengthOdd = arrLength % 2 != 0;
        return IntStream.range(0, arrLength)
                .map(i -> {
                    if (isIndexNeedToAdded(isArrLengthOdd, i)) {
                        return arr[i] + n;
                    }
                    return arr[i];
                }).toArray();
    }

    private boolean isIndexNeedToAdded(boolean isArrLengthOdd, int index) {
        if (isArrLengthOdd) return index % 2 == 0;
        return index % 2 != 0;
    }

    public int[] otherSolution(int[] arr, int n) {
        for (int idx = arr.length % 2 == 0 ? 1 : 0; idx < arr.length; idx += 2) {
            arr[idx] += n;
        }
        return arr;
    }
}
