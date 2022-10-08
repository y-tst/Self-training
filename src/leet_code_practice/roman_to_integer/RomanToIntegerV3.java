package leet_code_practice.roman_to_integer;

import java.util.HashMap;
import java.util.Map;

public class RomanToIntegerV3 {

    public static void main(String[] args) {
        System.out.println("MCMXCIV roman is " + romanToInt("MCMXCIV") + " in int");
    }

    public static int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();

        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        s = s.replace("IV", "IIII");
        s = s.replace("IX", "VIIII");
        s = s.replace("XL", "XXXX");
        s = s.replace("XC", "LXXXX");
        s = s.replace("CD", "CCCC");
        s = s.replace("CM", "DCCCC");
        int number = 0;

        for (int i = 0; i < s.length(); i++) {
            number = number + (map.get(s.charAt(i)));
        }

        return number;
    }
}