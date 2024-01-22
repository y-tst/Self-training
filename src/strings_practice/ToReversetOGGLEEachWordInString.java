package strings_practice;

public class ToReversetOGGLEEachWordInString {

    public static void main(String[] args) {

        String testString = "iuhoihofi fjfoij fojfoirj erofij eferf frr erf";

        System.out.println(reverseAndToggleEveryWord(testString));
    }

    public static String reverseAndToggleEveryWord(String testString) {

        String[] words = testString.split("\\s");
        String toggledString = "";

        for (String w : words) {

            StringBuffer sb = new StringBuffer(w);

            sb.reverse();

            String firstLetter = sb.toString().substring(0, 1);
            String afterFirst = sb.toString().substring(1);

            toggledString += firstLetter.toLowerCase() + afterFirst.toUpperCase() + " " ;
        }

        return toggledString.trim();
    }
}
