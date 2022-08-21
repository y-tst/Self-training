package interviewTasks.comparingTwoStringsIfReversed;

import java.util.ArrayList;

public class ComparingStringsIfReversed {

    // for isRotated():
//'javascript', 'scriptjava')) // -> true
//'javascript', 'iptjavascr')) // -> true
//'javascript', 'java')) // -> false

    public static void main(String[] args) {

//        System.out.println(isReversed("javascript", "tpircsavaj"));
//        System.out.println(isReversed("javascript", "iptjavascr"));
//        System.out.println(isReversed("javascript", "java"));
//        System.out.println(isReversed("abc123", "321cba"));

        System.out.println();

        System.out.println(isRrotated("javascript", "scriptjava"));
        System.out.println(isRrotated("javascript", "iptjavascr"));
        System.out.println(isRrotated("javascript", "java"));
        System.out.println(isRrotated("test", "java"));

    }

    public static boolean isReversed(String firstString, String secondString) {

        StringBuilder reversedSecondString = new StringBuilder();

        for (int i = secondString.length() - 1; i >= 0; i--) {
            reversedSecondString = reversedSecondString.append(secondString.toCharArray()[i]);
        }
        return firstString.equals(reversedSecondString.toString());
    }

    public static boolean isRrotated(String firstString, String secondString) {

        if (firstString.length() != secondString.length()) {
            return false;
        }


        ArrayList<Character> firstStringToArrayList = new ArrayList<>();
        ArrayList<Character> secondStringToArrayList = new ArrayList<>();

        for (char c : firstString.toCharArray()) {
            firstStringToArrayList.add(c);
        }

        for (char c : secondString.toCharArray()) {
            secondStringToArrayList.add(c);
        }

        for (int i = 0; i < firstStringToArrayList.size(); i++) {
            firstStringToArrayList.add(firstStringToArrayList.get(0));
            firstStringToArrayList.remove(0);
            if (firstStringToArrayList.equals(secondStringToArrayList)) {
                return true;
            }
        }
        return false;
    }
}
