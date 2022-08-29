package interviewTasks.anagramCheck;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Anagram {

//    ['abcd', 'bdac', 'cabd'] // true
//    ['aabcdd', 'bdaaac', 'cabddd'] // false
//    ['abcd', 'bdXc', 'cabd'] // false

    public static void main(String[] args) {

        System.out.println(checkIfElementsAreAnagrams(new String[]{"abcd", "bdac", "cabd"}));
        System.out.println(checkIfElementsAreAnagrams(new String[]{"aabcdd", "bdaaac", "cabddd"}));
        System.out.println(checkIfElementsAreAnagrams(new String[]{"abcd", "bdXc", "cabd"}));

        System.out.println();

        System.out.println(checkIfElementsAreAnagramsV2(new String[]{"abcd", "bdac", "cabd"}));
        System.out.println(checkIfElementsAreAnagramsV2(new String[]{"aabcdd", "bdaaac", "cabddd"}));
        System.out.println(checkIfElementsAreAnagramsV2(new String[]{"abcd", "bdXc", "cabd"}));

        System.out.println();

        System.out.println(checkIfElementsAreAnagramsV3(new String[]{"abcd", "bdac", "cabd"}));
        System.out.println(checkIfElementsAreAnagramsV3(new String[]{"aabcdd", "bdaaac", "cabddd"}));
        System.out.println(checkIfElementsAreAnagramsV3(new String[]{"abcd", "bdXc", "cabd"}));

    }

    public static boolean checkIfElementsAreAnagrams(String[] testArrayOfStrings) {

        for (int i = 0; i < testArrayOfStrings.length - 1; i++) {
            if (testArrayOfStrings[i].length() != testArrayOfStrings[i + 1].length())
                return false;

            List<Character> charList1 = convertStringToCharList(testArrayOfStrings[i]);
            List<Character> charList2 = convertStringToCharList(testArrayOfStrings[i + 1]);

            for (int k = 0; k < testArrayOfStrings[i].length(); k++) {

                if (charList1.contains(charList2.get(k))) {
                    charList1.remove(charList1.indexOf(charList2.get(k)));
                } else return false;
            }
        }
        return true;
    }

    //    var2 using sorting
    public static boolean checkIfElementsAreAnagramsV2(String[] testArrayOfStrings) {

        for (int i = 0; i < testArrayOfStrings.length - 1; i++) {
            if (testArrayOfStrings[i].length() != testArrayOfStrings[i + 1].length())
                return false;

            List<Character> charList1 = convertStringToCharList(testArrayOfStrings[i]).stream().sorted().collect(Collectors.toList());
            List<Character> charList2 = convertStringToCharList(testArrayOfStrings[i + 1]).stream().sorted().collect(Collectors.toList());

            if (charList1.equals(charList2))
                return true;
            else return false;
        }
        return true;
    }

    //    var3 using sorting
    public static boolean checkIfElementsAreAnagramsV3(String[] testArrayOfStrings) {

        for (int i = 0; i < testArrayOfStrings.length - 1; i++) {
            if (testArrayOfStrings[i].length() != testArrayOfStrings[i + 1].length())
                return false;

            List<Character> charList1 = convertStringToCharList(testArrayOfStrings[i]);
            List<Character> charList2 = convertStringToCharList(testArrayOfStrings[i + 1]);

            Collections.sort(charList1);
            Collections.sort(charList2);

            if (charList1.equals(charList2))
                return true;
            else return false;
        }
        return true;
    }

    public static List<Character>
    convertStringToCharList(String str) {
        List<Character> chars = str
                .chars()
                .mapToObj(e -> (char) e)
                .collect(Collectors.toList());
        return chars;
    }
}
