package org.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class 추억_점수 {

    //테스트 1 〉	통과 (2.67ms, 74.9MB)
    //테스트 2 〉	통과 (3.27ms, 79.3MB)
    //테스트 3 〉	통과 (4.73ms, 78.7MB)
    //테스트 4 〉	통과 (3.00ms, 75.4MB)
    //테스트 5 〉	통과 (5.21ms, 76.5MB)
    //테스트 6 〉	통과 (4.11ms, 83.8MB)
    //테스트 7 〉	통과 (14.28ms, 87.2MB)
    //테스트 8 〉	통과 (4.69ms, 79.3MB)
    //테스트 9 〉	통과 (6.91ms, 87.8MB)
    //테스트 10 〉	통과 (7.13ms, 100MB)
    //테스트 11 〉	통과 (7.42ms, 99MB)
    //테스트 12 〉	통과 (7.50ms, 93.4MB)
    //테스트 13 〉	통과 (21.07ms, 83.8MB)
    //테스트 14 〉	통과 (3.05ms, 66.4MB)
    public int[] solutionUseStream(String[] name, int[] yearning, String[][] photo) {
        Map<String, Integer> memoryScoreMap = createMemoryScoreMap(name, yearning);
        return Arrays.stream(photo)
                .mapToInt(subArray ->
                        Arrays.stream(subArray)
                                .mapToInt(nameInPhoto -> memoryScoreMap.getOrDefault(nameInPhoto, 0))
                                .sum())
                .toArray();
    }

    //테스트 1 〉	통과 (0.05ms, 72MB)
    //테스트 2 〉	통과 (0.06ms, 87.1MB)
    //테스트 3 〉	통과 (0.47ms, 78.8MB)
    //테스트 4 〉	통과 (0.39ms, 74.9MB)
    //테스트 5 〉	통과 (0.55ms, 83MB)
    //테스트 6 〉	통과 (1.01ms, 85.3MB)
    //테스트 7 〉	통과 (1.21ms, 93.6MB)
    //테스트 8 〉	통과 (1.18ms, 78.3MB)
    //테스트 9 〉	통과 (0.90ms, 89.1MB)
    //테스트 10 〉	통과 (2.34ms, 88.6MB)
    //테스트 11 〉	통과 (2.37ms, 108MB)
    //테스트 12 〉	통과 (1.16ms, 90.6MB)
    //테스트 13 〉	통과 (0.21ms, 78MB)
    //테스트 14 〉	통과 (0.03ms, 74.9MB)
    public int[] solutionUseForLoop(String[] name, int[] yearning, String[][] photo) {
        Map<String, Integer> memoryScoreMap = createMemoryScoreMap(name, yearning);
        int[] answer = new int[photo.length];
        for (int i = 0; i < photo.length; i++) {
            for (int j = 0; j < photo[i].length; j++) {
                answer[i] += memoryScoreMap.getOrDefault(photo[i][j], 0);
            }
        }
        return answer;
    }

    public Map<String, Integer> createMemoryScoreMap(String[] name, int[] yearning) {
        Map<String, Integer> memoryScoreMap = new HashMap<>();
        for (int i = 0; i < name.length; i++) {
            memoryScoreMap.put(name[i], yearning[i]);
        }
        return memoryScoreMap;
    }
}
