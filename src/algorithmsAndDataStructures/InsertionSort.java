package algorithmsAndDataStructures;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;


public class InsertionSort {
    private static final Logger LOGGER = Logger.getLogger(String.valueOf(InsertionSort.class));

    public static void main(String[] args) {

        Random random = new Random();
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
        }

        System.out.print("Before: ");
        printArray(numbers);

        sortNumbers(numbers);

        System.out.print("\nAfter: ");
        printArray(numbers);
    }

    public static void sortNumbers(int[] sourceNumbers) {

        for (int i = 1; i < sourceNumbers.length; i++) {

            int currentValue = sourceNumbers[i];
            int j = i - 1;

            while (j >= 0 && sourceNumbers[j] >= currentValue) {
                sourceNumbers[j + 1] = sourceNumbers[j];
                j--;
            }
            sourceNumbers[j + 1] = currentValue;
        }
    }

    public static void printArray(int[] sourceArray) {

        for (int j : sourceArray) {
            LOGGER.log(Level.INFO, String.valueOf(j), " ");
        }
    }
}
