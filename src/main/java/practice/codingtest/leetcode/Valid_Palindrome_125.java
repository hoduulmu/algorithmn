package practice.codingtest.leetcode;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Valid_Palindrome_125 {

    public static void main(String[] args) {
        new Valid_Palindrome_125_KT().isPalindrome("A man, a plan, a canal: Panama");
    }

    public boolean isPalindrome(String s) {
        String onlyAlphabetLowerString = s
                .replaceAll("[^[a-zA-Z0-9]*$]", "")
                .toLowerCase();
        List<Integer> chars = onlyAlphabetLowerString.chars()
                .boxed()
                .collect(Collectors.toList());
        Collections.reverse(chars);

        int[] reverse = chars.stream().mapToInt(Integer::intValue).toArray();
        int[] original = onlyAlphabetLowerString.chars().toArray();
        return Arrays.equals(original, reverse);
    }

    public boolean isPalindrome2(String s) {
        int start = 0;
        int end = s.length() - 1;

        while (start < end) {
            if (!Character.isLetterOrDigit(s.charAt(start))) {
                start++;
            } else if (!Character.isLetterOrDigit(s.charAt(end))) {
                end--;
            } else {
                if (Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end))) {
                    return false;
                }
                start++;
                end--;
            }
        }
        return true;
    }

    public boolean isPalindrome3(String s) {
        String filtered = s
                .replaceAll("[^[a-zA-Z0-9]*$]", "")
                .toLowerCase();
        String reversed = new StringBuilder(filtered).reverse().toString();
        return filtered.equals(reversed);
    }
}
