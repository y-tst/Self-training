package leet_code_practice.isomorphic_strings;


//Given two strings s and t, determine if they are isomorphic.
//
//        Two strings s and t are isomorphic if the characters in s can be replaced to get t.
//
//        All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.
//
//
//
//        Example 1:
//
//        Input: s = "egg", t = "add"
//        Output: true
//
//        Example 2:
//
//        Input: s = "foo", t = "bar"
//        Output: false
//
//        Example 3:
//
//        Input: s = "paper", t = "title"
//        Output: true
//
//        Input: s = "bbbaaaba", t = "aaabbbba"
//        Output: false


import java.util.*;
import java.util.stream.Collectors;

public class IsIsomorphic {

    static boolean isIsomorphic(String s, String t) {

        boolean isIsomorphic = false;

        List<Character> uniqueChars1 = new LinkedList<>();
        List<Character> uniqueChars2 = new LinkedList<>();
        List<Integer> repeated1 = new LinkedList<>();
        List<Integer> repeated2 = new LinkedList<>();

        if (s.length() == t.length()
                && s.chars()
                .mapToObj(e -> (char)e)
                .collect(Collectors.toSet())
                .size()
                == t.chars()
                .mapToObj(e -> (char)e)
                .collect(Collectors.toSet())
                .size()) {

            for (int i = 0; i < s.length(); i++) {

                if (uniqueChars1.contains(s.toCharArray()[i])) {
                    repeated1.add(i);
                } else uniqueChars1.add(s.toCharArray()[i]);

                if (uniqueChars2.contains(t.toCharArray()[i]) && uniqueChars1.indexOf(s.toCharArray()[i]) == uniqueChars2.indexOf(t.toCharArray()[i])) {
                    repeated2.add(i);
                } else uniqueChars2.add(t.toCharArray()[i]);
            }

            if (uniqueChars1.size() == uniqueChars2.size() && repeated1.equals(repeated2)) {
                isIsomorphic = true;
            }
        }

        return isIsomorphic;
    }

    public static void main(String[] args) {

        System.out.println("Strings 'paper' and  'title' are isomorphic - it is " + isIsomorphic("badc", "baba"));
    }
}

