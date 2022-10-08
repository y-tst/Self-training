package leet_code_practice.roman_to_integer;

import java.util.*;
import java.util.stream.Collectors;

//   Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
//
//        Symbol       Value
//        I             1
//        V             5
//        X             10
//        L             50
//        C             100
//        D             500
//        M             1000
//
//        For example, 2 is written as II in Roman numeral, just two ones added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.
//
//        Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:
//
//        I can be placed before V (5) and X (10) to make 4 and 9.
//        X can be placed before L (50) and C (100) to make 40 and 90.
//        C can be placed before D (500) and M (1000) to make 400 and 900.
//
//        Given a roman numeral, convert it to an integer.
//
//
//
//        Example 1:
//
//        Input: s = "III"
//        Output: 3
//        Explanation: III = 3.
//
//        Example 2:
//
//        Input: s = "LVIII"
//        Output: 58
//        Explanation: L = 50, V= 5, III = 3.
//
//        Example 3:
//
//        Input: s = "MCMXCIV"
//        Output: 1994
//        Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
//
//
//
//        Constraints:
//
//        1 <= s.length <= 15
//        s contains only the characters ('I', 'V', 'X', 'L', 'C', 'D', 'M').
//        It is guaranteed that s is a valid roman numeral in the range [1, 3999]

public class RomanToInteger {

    public static void main(String[] args) {
        System.out.println("MCMXCIV roman is " + romanToInt("IV") + " in int");
    }

    public static int romanToInt(String s) {

        int result = 0;

        List<Character> roman = new ArrayList<>(s.chars()
                .mapToObj(e -> (char) e)
                .collect(Collectors.toList()));

        for (int i = roman.size() - 1; i >= 0; i--) {

            char romanChar = roman.get(i);

            if (romanChar == 'M') {
                if (i > 0 && roman.get(i - 1) == 'C') {
                    result += 900;
                    i--;
                } else result += 1000;
            }

            if (romanChar == 'D') {
                if (i > 0 && roman.get(i - 1) == 'C') {
                    result += 400;
                    i--;
                } else result += 500;
            }

            if (romanChar == 'C') {
                if (i > 0 && roman.get(i - 1) == 'X') {
                    result += 90;
                    i--;
                } else result += 100;
            }

            if (romanChar == 'L') {
                if (i > 0 && roman.get(i - 1) == 'X') {
                    result += 40;
                    i--;
                } else result += 50;
            }

            if (romanChar == 'X') {
                if (i > 0 && roman.get(i - 1) == 'I') {
                    result += 9;
                    i--;
                } else result += 10;
            }

            if (romanChar == 'V') {
                if (i > 0 && roman.get(i - 1) == 'I') {
                    result += 4;
                    i--;
                } else result += 5;
            }

            if (romanChar == 'I') {
                result += 1;
            }
        }

        return result;
    }
}
