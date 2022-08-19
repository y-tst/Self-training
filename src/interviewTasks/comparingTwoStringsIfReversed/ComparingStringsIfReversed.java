package interviewTasks.comparingTwoStringsIfReversed;

public class ComparingStringsIfReversed {

//'javascript', 'scriptjava')) // -> true
//'javascript', 'iptjavascr')) // -> true
//'javascript', 'java')) // -> false

    public static void main(String[] args) {

        System.out.println(isReversed("javascript", "tpircsavaj"));
        System.out.println(isReversed("javascript", "iptjavascr"));
        System.out.println(isReversed("javascript", "java"));
        System.out.println(isReversed("abc123", "321cba"));

    }

    public static boolean isReversed(String firstStrind, String secondString) {

        StringBuilder reversedSecondString = new StringBuilder();

        for (int i = secondString.length() - 1; i >= 0; i--) {
            reversedSecondString = reversedSecondString.append(secondString.toCharArray()[i]);
        }
        return firstStrind.equals(reversedSecondString.toString());
    }
}
