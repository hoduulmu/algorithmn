package practice.codingtest.leetcode;

public class Reverse_String_344 {

    public static void main(String[] args) {
        new Reverse_String_344().reverseString(new char[]{'H','a','n','n','a','h'});
    }

    public void reverseString(char[] s) {
        for (int i = 0; i < s.length / 2; i++) {
            char temp = s[i];
            s[i] = s[s.length - (i + 1)];
            s[s.length - (i + 1)] = temp;
        }
    }

    public void reverseString2(char[] s) {
        int start = 0;
        int end = s.length - 1;

        while (start < end) {
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }
    }
}
