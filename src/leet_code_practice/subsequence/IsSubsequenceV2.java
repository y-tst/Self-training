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

public class IsSubsequenceV2 {

    static boolean isSubsequence(String s, String t) {

        if (s.length() == 0) {
            return true;
        }

        int i = 0;
        int j = 0;

        while (i < s.length() && j < t.length()) {

            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }

            if (s.length() == i) {
                return true;
            }

            j++;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println("Is " + "abc" + " the subsequence of " + "ahbgdc" + " --> " + isSubsequence("abc", "ahbgdc"));
        System.out.println("Is " + "axc" + " the subsequence of " + "abcde" + " --> " + isSubsequence("axc", "abcde"));
        System.out.println(isSubsequence("acb", "ahbgdc"));
        System.out.println(isSubsequence("ab", "baab"));
    }
}
