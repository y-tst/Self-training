package strings_practice;

public class TotOGGLEEachWordInString {

    public static void main(String[] args) {

        String testString = "iuhoihofi fjfoij fojfoirj erofij eferf frr erf";

        System.out.println(toggleEveryWord(testString));
    }

    public static String toggleEveryWord(String testString) {
        String[] words = testString.split("\\s");
        String toggledString = "";

        for (String w : words) {

            String firstLetter = w.substring(0, 1);
            String afterFirst = w.substring(1);

            toggledString += firstLetter.toLowerCase() + afterFirst.toUpperCase() + " " ;
        }

        return toggledString.trim();
    }
}
