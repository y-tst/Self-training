package leet_code_practice;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringLengthV2 {

    public static void main(String[] args) {

        // Longest Substring Length with unique chars

        String testString = "abcabrttteabcdgt";

        System.out.println("For srtring " + testString + ":");
        System.out.println(" Longest Substring Length with unique chars - " + longestSubstringEvaluator(testString));


    }

    public static int longestSubstringEvaluator(String s) {

        int maxLength = 0;

        Map<Character, Integer> visitedCharachters = new HashMap<>();

        for (int right = 0, left = 0; right < s.length() - 1; right++) {
            char currentChar = s.charAt(right);

            if (visitedCharachters.containsKey(currentChar) &&
                    visitedCharachters.get(currentChar) >= left) {
                left = visitedCharachters.get(currentChar) + 1;
            }

            maxLength = Math.max(maxLength, right - left + 1);
            visitedCharachters.put(currentChar, right);
        }

        return maxLength;
    }
}
