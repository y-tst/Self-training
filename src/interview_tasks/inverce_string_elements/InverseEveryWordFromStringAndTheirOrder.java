package interview_tasks.inverce_string_elements;

import java.util.Arrays;

public class InverseEveryWordFromStringAndTheirOrder {

    public static void main(String[] args) {
        String s = "Azure is the modern IT company";

        System.out.println("Before String - " + s);
        System.out.println("After String V1 - " + inverseOrderOfLettersAndWords(s));
        System.out.println("After String V2 - " + inverseOrderOfLettersAndWordsV2(s));
        System.out.println("After String V3 - " + inverseOrderOfLettersAndWordsV2(s));


    }

    public static String inverseOrderOfLettersAndWords(String beforeString) {
        String[] arrayOfLetters = beforeString.split("");
        String current;
        for (int i = 0; i < arrayOfLetters.length / 2; i++) {
            current = arrayOfLetters[i];
            arrayOfLetters[i] = arrayOfLetters[arrayOfLetters.length - i - 1];
            arrayOfLetters[arrayOfLetters.length - i - 1] = current;
        }

        /*
        result.reverse();
        - reverse is allowed for StringBuilder
        it would do the same:
         */
        StringBuilder result = new StringBuilder();
        for (String s : arrayOfLetters) {
            result.append(s);
        }

        return result.toString();
    }

    public static String inverseOrderOfLettersAndWordsV2(String beforeString) {
        char[] arrayOfLetters = beforeString.toCharArray();
        char current;
        for (int i = 0; i < arrayOfLetters.length / 2; i++) {
            current = arrayOfLetters[i];
            arrayOfLetters[i] = arrayOfLetters[arrayOfLetters.length - i - 1];
            arrayOfLetters[arrayOfLetters.length - i - 1] = current;
        }

        return new String(arrayOfLetters);
    }

    public static String inverseOrderOfLettersAndWordsV3(String beforeString) {
        char[] arrayOfLetters = beforeString.toCharArray();
        StringBuilder result = new StringBuilder();
        for (int i = arrayOfLetters.length - 1; i >= 0; i--) {
            result.append(arrayOfLetters[i]);
        }

        return result.toString();
    }
}
