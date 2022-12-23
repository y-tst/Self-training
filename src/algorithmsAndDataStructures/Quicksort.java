package algorithmsAndDataStructures;

import java.util.Random;

public class Quicksort {

    private Random random = new Random();
    static int[] randomNumbers = new int[10];

    public static void main(String[] args) {

        Random random = new Random();
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
        }

        System.out.println("Initial unsorted array: ");
        printArray(numbers);

        quicksort(numbers, 0, numbers.length - 1);

        System.out.println("Sorted array: ");
        printArray(numbers);
    }

    public static void quicksort(int[] array, int lowIndex, int highIndex){

        if (lowIndex >= highIndex){
            return;
        }

        int pivot = array[highIndex];   // just choosing any element

        int leftPointer = lowIndex;
        int rightPointer = highIndex;

        while (leftPointer < rightPointer){

            while (array[leftPointer] <= pivot && leftPointer < rightPointer){
                leftPointer++;
            }

            while (array[rightPointer] >= pivot && leftPointer < rightPointer){
                rightPointer--;
            }

            swap(array, leftPointer, rightPointer);
        }

        swap(array, leftPointer, highIndex);

        quicksort(array,lowIndex, leftPointer - 1);
        quicksort(array,rightPointer + 1,highIndex);

    }

    public static void swap(int[] array, int index1, int index2){
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void printArray(int[] arrayToPrint){
        for (int i = 0; i < arrayToPrint.length; i++) {
            System.out.println(arrayToPrint[i] + " ");
        }
    }
}
