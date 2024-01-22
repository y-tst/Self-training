package strings_practice;

public class CheckPalindrome {

    public static void main(String[] args) {

        String str1 = "qwerttrewq";
        String str2 = "qwertscfferewq";

        System.out.println(isPalindrome(str1));
        System.out.println(isPalindrome(str2));

    }

    public static boolean isPalindrome (String testString) {

        StringBuffer sb = new StringBuffer(testString);
        return  sb.reverse().toString().equals(testString);
    }
}
