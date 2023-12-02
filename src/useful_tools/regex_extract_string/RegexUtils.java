package useful_tools.regex_extract_string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * This class provides utility methods for working with regular expressions.
 */

public class RegexUtils {


    /**
     * Extracts the first occurrence of a string that matches the given regular expression pattern.
     *
     * @param input   The input string from which to extract the matching string.
     * @param pattern The regular expression pattern to match.
     * @return Returns the first occurrence of a string that matches the given pattern, or null if no match is found.
     */
    public static String extractString(String input, String pattern) {
        Pattern regexPattern = Pattern.compile(pattern);
        Matcher matcher = regexPattern.matcher(input);

        if (matcher.find()) {
            return matcher.group();
        }

        return null;
    }

    /**
     * Main method to demonstrate the usage of the extractString method.
     *
     * @param args Command-line arguments.
     */
    public static void main(String[] args) {
        String input = "Your bla bla bla 112422 asedj";
        String pattern = "[0-9]{6}";

        String extractedString = extractString(input, pattern);
        System.out.println("Extracted string: " + extractedString);
    }
}
