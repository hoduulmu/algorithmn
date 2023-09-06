package practice.codingtest.programmers;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class 로또의_최고_순위와_최저_순위 {
    public int[] solution(int[] lottos, int[] win_nums) {
        Set<Integer> winNums = Arrays.stream(win_nums).boxed().collect(Collectors.toSet());
        int zeroNums = 0;
        int correctNums = 0;
        for (int num: lottos) {
            if (winNums.contains(num)) correctNums += 1;
            if (num == 0) zeroNums += 1;
        }

        int maxCorrectNum = correctNums + zeroNums;
        int maxRank = maxCorrectNum > 1 ? 6 - maxCorrectNum + 1 : 6;
        int minRank = correctNums > 1 ? 6 - correctNums + 1 : 6;
        return new int[]{maxRank, minRank};
    }

    public int[] anotherSolution(int[] lottos, int[] win_nums) {
        int[] rank = {6, 6, 5, 4, 3, 2, 1};
        int answer = 0;
        int hidden = 0;

        Arrays.sort(win_nums);
        for (int i = 0; i < lottos.length; i++)
            if (Arrays.binarySearch(win_nums, lottos[i]) > -1)
                answer++;
            else if (lottos[i] == 0)
                hidden++;

        return new int[] {rank[answer + hidden], rank[answer]};
    }
}
