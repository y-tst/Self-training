package strings_practice;

public class RemoveSpecifiedSymbolsFromString {

    public static void main(String[] args) {

        String ws = "I'm    from   Ukraine";
        String numberHavingCommas = "1,000,000";

        System.out.println(removeWhiteSpaces1(ws));
        System.out.println(removeWhiteSpaces2(ws));
        System.out.println(removeCommasFromStringAndConvertToInt(numberHavingCommas));
    }

    public static String removeWhiteSpaces1 (String testString) {

        return testString.replaceAll("\\s", "");
    }

    public static String removeWhiteSpaces2 (String testString) {

        StringBuilder removedWhiteSpaces = new StringBuilder();
        char chars[] = testString.toCharArray();

        for(char ch : chars){
            if(ch != ' ' && ch != '\t') {
                removedWhiteSpaces.append(ch);
            }
        }
        return removedWhiteSpaces.toString();
    }

    public static int removeCommasFromStringAndConvertToInt (String testString) {
        return Integer.parseInt(testString.replaceAll(",", ""));
    }
}
