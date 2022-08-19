package interviewTasks.transformStringHvingNoDuplications;

//(removeDupes('abcd')) // -> 'abcd'
//(removeDupes('aabbccdd')) // -> 'abcd'
//(removeDupes('abcddbca')) // -> 'abcd'
//(removeDupes('abababcdcdcd')) // -> 'abcd'


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StringWithNoDuplications {

    static String s1 = "abcd";
    static String s2 = "aabbccdd";
    static String s3 = "abcddbca";
    static String s4 = "abcddbca";

    public static void main(String[] args) {

        System.out.println(removeDupes(s1));
        System.out.println(removeDupes(s2));
        System.out.println(removeDupes(s3));
        System.out.println(removeDupes(s4));
        System.out.println();
        System.out.println(removeDupesV2(s1));
        System.out.println(removeDupesV2(s2));
        System.out.println(removeDupesV2(s3));
        System.out.println(removeDupesV2(s4));
    }

    // var1:
    static String removeDupes(String stringToRemoveDuplications) {

        String stringWithoutDuplications = new String();

        char[] charsArrayFromString = stringToRemoveDuplications.toCharArray();
        List<Character> characterList = new ArrayList<>();

        for (char c : charsArrayFromString) {
            characterList.add(c);
        }

        for (int i = 0; i < characterList.size(); i++) {
            for (int j = i + 1; j < characterList.size(); j++) {
                if (characterList.get(i) == characterList.get(j)){
                    characterList.remove(j);
                }
            }
        }

        for (char c : characterList) {
            stringWithoutDuplications += c;
        }

        return stringWithoutDuplications;
    }

    // var2:

    static String removeDupesV2(String stringToRemoveDuplications) {

    return stringToRemoveDuplications.chars()
            .mapToObj(c -> (char) c)
            .collect(Collectors.toSet())
            .stream()
            .map(e->e.toString())
            .collect(Collectors.joining());
    }
}