package algorithmsAndDataStructures;

import java.util.Arrays;
import java.util.Collections;

public class GreedyAlgorithms {

    public static void main(String[] args) {
        int [] digits = {5, 7, 8, 3, 1, 9, 7};
        System.out.println(maxNumberFromDigits(digits));
    }

    public static String maxNumberFromDigits(int[] digits) {
        return String.join("", Arrays.stream(digits).boxed()
                .sorted(Collections.reverseOrder())
                .map(String::valueOf)
                .toArray(String[]::new));
    }

//    public static String maxNumberFromDigits(int[] digits) {
//        String result = "";
//
//        Arrays.sort(digits);
//
//        for (int i = digits.length - 1; i >= 0; i--)
//            result += digits[i];
//
//        return result;
//    }
}
