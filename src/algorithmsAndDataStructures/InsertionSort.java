package algorithmsAndDataStructures;

import java.util.Random;

public class InsertionSort {

    public static void main(String[] args) {

        Random random = new Random();
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
        }

        System.out.println("Before: ");
        printArray(numbers);

        sortNumbers(numbers);

        System.out.println("After: ");
        printArray(numbers);
    }

    public static void sortNumbers(int[] sourceNumbers) {
        int temp = sourceNumbers[0];
        for (int i = 1; i < sourceNumbers.length; i++) {
            while (sourceNumbers[i] < sourceNumbers[i - 1]) {
                temp = sourceNumbers[i - 1];
                sourceNumbers[i] = sourceNumbers[i - 1];
                sourceNumbers[i] = temp;
            }
        }
    }

    public static void printArray(int[] sourceArray) {
        for (int i = 0; i < sourceArray.length; i++) {
            System.out.println(sourceArray[i] + " ");
        }
    }
}
