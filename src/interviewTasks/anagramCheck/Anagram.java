package interviewTasks.anagramCheck;

import java.util.List;
import java.util.stream.Collectors;

public class Anagram {

//    ['abcd', 'bdac', 'cabd'] // true
//    ['aabcdd', 'bdaaac', 'cabddd'] // false
//    ['abcd', 'bdXc', 'cabd'] // false

    public static void main(String[] args) {

        System.out.println(checkIfElementsAreAnagramms(new String[]{"abcd", "bdac", "cabd"}));
        System.out.println(checkIfElementsAreAnagramms(new String[]{"aabcdd", "bdaaac", "cabddd"}));
        System.out.println(checkIfElementsAreAnagramms(new String[]{"abcd", "bdXc", "cabd"}));
    }

    public static boolean checkIfElementsAreAnagramms(String[] testArrayOfStrings) {

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

    public static List<Character>
    convertStringToCharList(String str) {
        List<Character> chars = str
                .chars()
                .mapToObj(e -> (char) e)
                .collect(Collectors.toList());
        return chars;
    }

//    var2 using sorting

}
