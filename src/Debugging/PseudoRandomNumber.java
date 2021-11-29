package Debugging;

public class PseudoRandomNumber {

    public static void main(String[] args) {
        example2();
    }

    private static void example2() {
        int randomValue1 = pseudorandomFunction(100);
        int randomValue2 = pseudorandomFunction(100);

        System.out.println("Two random numbers: " + randomValue1 + " and " + randomValue2);
    }

    private static int processingNumber = 321655;

    private static int pseudorandomFunction(int maxValue) {
        processingNumber = processingNumber * 26555445 / 2333 + maxValue;
        return Math.abs(processingNumber / 258) % (maxValue + 2);

    }
}
