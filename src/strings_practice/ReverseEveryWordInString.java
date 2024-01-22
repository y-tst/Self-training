package strings_practice;

public class ReverseEveryWordInString {

    public static void main(String[] args) {

        String testString = "Dfdgdf fgdg ggrwwewe fr weweweqq!";
        System.out.println(reverseEveryWord(testString));
    }

    public static String reverseEveryWord(String testString) {

        String[] words = testString.split("\\s");
        String reversedWordsString = "";

        for (String w : words) {

            StringBuffer sb = new StringBuffer(w);
            reversedWordsString+= sb.reverse().toString() + " ";
        }
        return reversedWordsString.trim();
    }
}
