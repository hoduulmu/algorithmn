package practice.codingtest.leetcode;

import java.util.*;

public class Most_Common_Word_819 {

    public static void main(String[] args) {
        new Most_Common_Word_819().mostCommonWord(
                "a, a, a, a, b,b,b,c, c",
                new String[]{"a"}
        );
    }

    public String mostCommonWord(String paragraph, String[] banned) {
        String lowerParagraph = paragraph.toLowerCase();
        String[] words = lowerParagraph.split("[\\s!?,;.]+");
        Set<String> banneds = Set.of(banned);

        Map<String, Integer> wordToCount = new HashMap<>();
        for (String word: words) {
            String onlyAlphabetWord = word.replaceAll("[^a-zA-Z]", "");
            wordToCount.merge(onlyAlphabetWord, 1, (x, x2) -> x + 1);
        }

        List<Map.Entry<String, Integer>> sortedWords = wordToCount.entrySet()
                .stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .toList();

        for (Map.Entry<String, Integer> kv : sortedWords) {
            if (!banneds.contains(kv.getKey())) {
                return kv.getKey();
            }
        }

        return null;
    }

    public String mostCommonWord2(String paragraph, String[] banned) {
        Set<String> ban = Set.of(banned);
        Map<String, Integer> counts = new HashMap<>();

        String[] words = paragraph.replaceAll("\\W+", " ").toLowerCase().split(" ");

        for (String w : words) {
            if (!ban.contains(w)) {
                counts.put(w, counts.getOrDefault(w, 0) + 1);
            }
        }

        return Collections.max(counts.entrySet(), Map.Entry.comparingByValue()).getKey();
    }
}
