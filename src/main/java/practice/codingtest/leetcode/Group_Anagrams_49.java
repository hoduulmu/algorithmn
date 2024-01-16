package practice.codingtest.leetcode;

import java.util.*;

public class Group_Anagrams_49 {

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagrams = new HashMap<>();
        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sorted = String.valueOf(chars);
            List<String> strings = anagrams.getOrDefault(sorted, new ArrayList<>());
            strings.add(str);
            anagrams.put(sorted, strings);
        }

        return anagrams.values().stream().toList();
    }
}
