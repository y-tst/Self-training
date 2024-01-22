package strings_practice;

public class ReverseString {

    public static void main(String[] args) {

        String testString = "Hello world!";

        System.out.println(reverseString1(testString));
        System.out.println(reverseString2(testString));
    }

    public static String reverseString1(String inputString) {

        StringBuffer sb = new StringBuffer(inputString);

        return  sb.reverse().toString();
    }

    public static String reverseString2(String inputString) {

        char[] charArrayFromString =  inputString.toCharArray();
        String reversedString = "";

        for (int i = inputString.length() - 1; i >= 0 ; i--) {
            reversedString += charArrayFromString[i];
        }

        return reversedString;
    }
}
