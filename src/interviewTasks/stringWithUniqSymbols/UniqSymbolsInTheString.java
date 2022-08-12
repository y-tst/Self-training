package interviewTasks.stringWithUniqSymbols;


//        // Custom input string
//        String str = "GeeksForGeeks";
//
//        // Creating array of string length
//        // using length() method
//        char[] ch = new char[str.length()];
//
//        // Copying character by character into array
//        // using for each loop
//        for (int i = 0; i < str.length(); i++) {
//            ch[i] = str.charAt(i);
//        }
//
//        // Printing the elements of array
//        // using for each loop
//        for (char c : ch) {
//            System.out.println(c);

public class UniqSymbolsInTheString {

    private String line1 = "abcdef";   // -> true
    private String line2 = "1234567";  // -> true
    private String line3 = "abcABC";   // -> true
    private String line4 = "abcadef";  // -> false

    public static void main(String[] args) {

    }


    public static boolean uniqSymbolsInTheString(String examingString) {


        char[] charsArray = new char[examingString.length()];
        for (int i = 0; i < examingString.length(); i++) {
            charsArray[i] = examingString.charAt(i);


        }
        return true;

    }

}
