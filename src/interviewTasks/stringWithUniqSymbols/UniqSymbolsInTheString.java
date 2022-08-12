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

    static String line1 = "abcdef";   // -> true
    static String line2 = "1234567";  // -> true
    static String line3 = "abcABC";   // -> true
    static String line4 = "abcadef";  // -> false

    public static void main(String[] args) {

        System.out.println(AreSymbolsInTheStringUnique(line1));
        System.out.println(AreSymbolsInTheStringUnique(line2));
        System.out.println(AreSymbolsInTheStringUnique(line3));
        System.out.println(AreSymbolsInTheStringUnique(line4));
    }


    public static boolean AreSymbolsInTheStringUnique(String examiningString) {

        char[] transformedToChar = stringToCharArray(examiningString);
        for (int i = 0; i < transformedToChar.length - 1; i++) {
            for (int k = i + 1; k <= transformedToChar.length - 1; k++) {
                if (transformedToChar[i] == transformedToChar[k])
                    return false;
            }
        }
        return true;
    }

    public static char[] stringToCharArray(String charArrayCandidate) {

        char[] charsArray = new char[charArrayCandidate.length()];          //char[] charsArray = charArrayCandidate.toCharArray();
        for (int i = 0; i < charArrayCandidate.length(); i++) {
            charsArray[i] = charArrayCandidate.charAt(i);
        }

        return charsArray;
    }

}
