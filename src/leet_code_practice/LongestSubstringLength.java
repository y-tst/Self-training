package leet_code_practice;

public class LongestSubstringLength {

    public static void main(String[] args) {

        // Longest Substring Length with unique chars

        String testString = "abcabrttteabcdgt";

        System.out.println("For srtring " + testString + ":");
        System.out.println(" Longest Substring with unique chars - " + longestSubstringEvaluator(testString).s);
        System.out.println(" Longest Substring Length with unique chars - " + longestSubstringEvaluator(testString).length);


    }

    public static Substring longestSubstringEvaluator(String s) {

        Substring ss =  new Substring("", 0);

        for (int i = 0; i < s.length() - 1; i++) {
            StringBuilder currentSubstring = new StringBuilder();
            for (int j = i; j < s.length(); j++) {
                if (currentSubstring.indexOf(String.valueOf(s.charAt(j))) != -1){
                    break;
                }
                currentSubstring.append(s.charAt(j));
                ss.length = Math.max(ss.length, currentSubstring.length());
                ss.s = String.valueOf(currentSubstring);

            }
        }

        return ss;
    }

    public static class Substring{
        String s;
        int length;

        public Substring(String s, int length) {
            this.s = s;
            this.length = length;
        }
    }
}
