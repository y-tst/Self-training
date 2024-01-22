package strings_practice;

public class CapitalizeEveryWordInString {

    public static void main(String[] args) {

        String testString = "iuhoihofi fjfoij fojfoirj erofij eferf frr erf";

        System.out.println(capitalizeEveryWord(testString));
    }

    public static String capitalizeEveryWord(String testString) {

        String[] words = testString.split("\\s");
        String capitalizedString = "";

        for (String w : words) {

            String firstLetter = w.substring(0, 1);
            String afterFirst = w.substring(1);

            capitalizedString += firstLetter.toUpperCase() + afterFirst + " " ;
        }

        return capitalizedString.trim();
    }
}
