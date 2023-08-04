package algorithmsAndDataStructures;

import java.util.Random;

public class MergeSort {

    public static void main(String[] args) {

        Random rand = new Random();
        int[] numbers = new int[10];

        for (int i = 0; i < 10; i++) {
            numbers[i] = rand.nextInt(100
            );
        }

        System.out.println("Before: ");
        printArray(numbers);

        mergeSort(numbers);

        System.out.println("\nAfter: ");
        printArray(numbers);
    }

    public static void mergeSort(int[] inputArray){

        int inputLength = inputArray.length;

        if (inputLength < 2) {
            return;
        }

        int midIndex = inputLength / 2;
        int[] leftHalf = new int[midIndex];
        int[] rightHalf = new int[inputLength - midIndex];

        for (int i = 0; i < midIndex; i++) {
            leftHalf[i] = inputArray[i];
        }

        for (int i = midIndex; i < inputLength; i++) {
            rightHalf[i - midIndex] = inputArray[i];
        }

        mergeSort(leftHalf);
        mergeSort(rightHalf);

        merge(inputArray, leftHalf, rightHalf);
    }

    private static void merge(int[] inputArray, int[] leftHalf, int[] rightHalf) {

        int leftSize = leftHalf.length;
        int rightSize = rightHalf.length;

        int leftIterator = 0, rightIterator = 0, mergedArrayIterator = 0;

        while (leftIterator < leftSize && rightIterator < rightSize) {

            if (leftHalf[leftIterator] <= rightHalf[rightIterator]){
                inputArray[mergedArrayIterator] = leftHalf[leftIterator];
                leftIterator++;
            }
            else {
                inputArray[mergedArrayIterator] = rightHalf[rightIterator];
                rightIterator++;
            }

            mergedArrayIterator++;
        }


        while (leftIterator < leftSize) {
            inputArray[mergedArrayIterator] = leftHalf[leftIterator];
            leftIterator++;
            mergedArrayIterator++;
        }

        while (rightIterator < rightSize) {
            inputArray[mergedArrayIterator] = rightHalf[rightIterator];
            rightIterator++;
            mergedArrayIterator++;
        }
    }

    public static void printArray(int[] arrayToPrint){
        for (int i = 0; i < arrayToPrint.length; i++) {
            System.out.print(arrayToPrint[i] + " ");
        }
    }
}
