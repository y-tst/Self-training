package Debugging;

public class ReverseSorting {

    private static String initialPrase = "Just something to reverse";

    public static void main(String[] args) {
        example();
    }

    private static void example() {
        StringBuilder reversed = new StringBuilder();

        for (int i = initialPrase.length() - 1; i >= 0; i--) {

            reversed.append(initialPrase.charAt(i));
        }

        System.out.println(reversed);
    }
}

