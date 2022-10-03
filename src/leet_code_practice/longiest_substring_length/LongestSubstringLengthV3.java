package leet_code_practice.longiest_substring_length;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringLengthV3 {

    public static void main(String[] args) {

        // Longest Substring Length with unique chars
        // Sliding window Algorithm

        String testString = "abcabrttteabcdgt";

        System.out.println("For srtring " + testString + ":");
        System.out.println(" Longest Substring Length with unique chars - " + longestSubstringEvaluator(testString));


    }

    public static int longestSubstringEvaluator(String s) {

        int maxLength = 0;

        for (int right = 0, left = 0; right < s.length() - 1; right++) {

            int indexOfFirstAppearanceInSubstring = s.indexOf(s.charAt(right), left);
            if (indexOfFirstAppearanceInSubstring != right) {
                left = indexOfFirstAppearanceInSubstring + 1;
            }

            maxLength = Math.max(maxLength, right - left + 1);

        }

        return maxLength;
    }
}
