package leet_code_practice.isomorphic_strings;

import java.util.*;
import java.util.stream.Collectors;

public class IsIsomorphicV2 {

    static boolean isIsomorphic(String s, String t) {

        int size = 256;

        int m = s.length();
        int n = t.length();

        // Length of both strings must be same for one to
        // one correspondence
        if (m != n)
            return false;

        // To mark visited characters in t
        Boolean[] marked = new Boolean[size];
        Arrays.fill(marked, Boolean.FALSE);

        // To store mapping of every character from s to
        // that of t. Initialize all entries of map as
        // -1.
        int[] map = new int[size];
        Arrays.fill(map, -1);

        // Process all characters one by on
        for (int i = 0; i < n; i++) {
            // If current character of s is seen first
            // time in it.
            if (map[s.charAt(i)] == -1) {
                // If current character of t is already
                // seen, one to one mapping not possible
                if (marked[t.charAt(i)] == true)
                    return false;

                // Mark current character of t as visited
                marked[t.charAt(i)] = true;

                // Store mapping of current characters
                map[s.charAt(i)] = t.charAt(i);
            }

            // If this is not first appearance of current
            // character in s, then check if previous
            // appearance mapped to same character of t
            else if (map[s.charAt(i)] != t.charAt(i))
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println("Strings 'paper' and  'title' are isomorphic - it is " + isIsomorphic("title", "title"));
    }
}

