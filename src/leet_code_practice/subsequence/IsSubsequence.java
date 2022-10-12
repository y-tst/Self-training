package leet_code_practice.subsequence;

//        Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
//
//        A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).

//        Example 1:
//        Input: s = "abc", t = "ahbgdc"
//        Output: true
//
//        Example 2:
//        Input: s = "axc", t = "ahbgdc"
//        Output: false

//        Constraints:
//
//        0 <= s.length <= 100
//        0 <= t.length <= 104
//        s and t consist only of lowercase English letters.

import java.util.List;
import java.util.stream.Collectors;

public class IsSubsequence {

    static boolean isSubsequence(String s, String t) {

        int n = -1;

        if (s.length() > t.length()) return false;

        List<Character> list = t.chars()
                .mapToObj(e -> (char) e)
                .collect(Collectors.toList());

//        while (list.contains(s.charAt(i)))

        for (int i = 0; i < s.length(); i++) {


            if (list.contains(s.charAt(i)) && list.indexOf(s.charAt(i)) > n) {
                n = list.indexOf(s.charAt(i)) - 1;
                list.remove(list.indexOf(s.charAt(i)));
                if (list.contains(s.charAt(i)) && list.indexOf(s.charAt(i)) > n) {
                    n = list.indexOf(s.charAt(i)) - 1;
                    list.remove(list.indexOf(s.charAt(i)));
                }
            } else return false;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println("Is " + "abc" + " the subsequence of " + "ahbgdc" + " --> " + isSubsequence("abc", "ahbgdc"));
        System.out.println("Is " + "axc" + " the subsequence of " + "abcde" + " --> " + isSubsequence("axc", "abcde"));
        System.out.println(isSubsequence("acb", "ahbgdc"));
        System.out.println(isSubsequence("ab", "baab"));
    }
}
