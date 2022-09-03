package interview_tasks.stringWithUniqSymbols;


//        // Custom input string
//        String str = "GeeksForGeeks";
//
//        // Creating array of string length
//        // using length() method
//        char[] ch = new char[str.length()];
//
//        // Copying character by character into array
//        // using for each loop
//        for (int i = 0; i < str.length(); i++) {
//            ch[i] = str.charAt(i);
//        }
//
//        // Printing the elements of array
//        // using for each loop
//        for (char c : ch) {
//            System.out.println(c);

import java.util.*;

public class UniqSymbolsInTheString {

    static String line1 = "abcdef";   // -> true
    static String line2 = "1234567";  // -> true
    static String line3 = "abcABC";   // -> true
    static String line4 = "abcadef";  // -> false

    public static void main(String[] args) {

        System.out.println(AreSymbolsInTheStringUnique(line1));
        System.out.println(AreSymbolsInTheStringUnique(line2));
        System.out.println(AreSymbolsInTheStringUnique(line3));
        System.out.println(AreSymbolsInTheStringUnique(line4));
        System.out.println();

        System.out.println(isUniq(line1));
        System.out.println(isUniq(line2));
        System.out.println(isUniq(line3));
        System.out.println(isUniq(line4));
        System.out.println();

        System.out.println(isUniqV2(line1));
        System.out.println(isUniqV2(line2));
        System.out.println(isUniqV2(line3));
        System.out.println(isUniqV2(line4));
        System.out.println();

        System.out.println(isUniqV3(line1));
        System.out.println(isUniqV3(line2));
        System.out.println(isUniqV3(line3));
        System.out.println(isUniqV3(line4));
    }

    // 1st vriant:
    public static boolean AreSymbolsInTheStringUnique(String examiningString) {

        char[] transformedToChar = stringToCharArray(examiningString);
        for (int i = 0; i < transformedToChar.length - 1; i++) {
            for (int k = i + 1; k <= transformedToChar.length - 1; k++) {
                if (transformedToChar[i] == transformedToChar[k])
                    return false;
            }
        }
        return true;
    }


    public static char[] stringToCharArray(String charArrayCandidate) {

        char[] charsArray = new char[charArrayCandidate.length()];          //char[] charsArray = charArrayCandidate.toCharArray();
        for (int i = 0; i < charArrayCandidate.length(); i++) {
            charsArray[i] = charArrayCandidate.charAt(i);
        }

        return charsArray;
    }


    // 2nd variant:
    public static boolean isUniq(String testString) {

        for (int i = 0; i < testString.length(); i++) {
            final char SYMBOL = testString.charAt(i);

            if (testString.lastIndexOf(SYMBOL) != i) {
                return false;
            }
        }
        return true;
    }

    //3rd variant:
    public static boolean isUniqV2(String testString) {

        final Set<Character> testedString = new HashSet<Character>();

        for (int i = 0; i < testString.length(); i++) {
            final char SYMBOL = testString.charAt(i);

            if (testedString.contains(SYMBOL))
                return false;

            testedString.add(SYMBOL);
        }
        return true;
    }

    //4th variant:
    public static boolean isUniqV3(String testString) {

        // this way:
//        List<Character> characterList = testString.chars().mapToObj(e -> (char)e).collect(Collectors.toList());
//        Set<Character> characterSet = new HashSet<Character>(characterList);

        // or this way:
        Set<Character> characterSet = new HashSet<>();
        testString.chars().forEach(e -> characterSet.add((char) e));

        return testString.length() == characterSet.size();
    }

}
