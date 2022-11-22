package interview_tasks.exact_sum_from_two_elements_of_array;

/*
Return the array of two elements from current array, that makes needed number by sum  !!!Array is sorted
 */

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ExactSumV3 {

    static int[] arr1 = {-1, 2, 5, 8};
    static int k1 = 7;         // -> [2, 5]

    static int[] arr2 = {-3, -1, 0, 2, 6};
    static int k2 = 6;         // -> [0, 6]

    static int[] arr3 = {2, 4, 5};
    static int k3 = 8;          // -> []

    static int[] arr4 = {-2, -1, 1, 2};
    static int k4 = 0;           // -> [-2, 2]  (first of two possible solutions)

    static int[] arr5 = {-7, 0, 1, 2, 3, 5, 10, 12, 22, 58, 64, 87};
    static int k5 = 10;          // -> -> [0, 10]

    public static void main(String[] args) {
        System.out.println(Arrays.toString(subArrayOfTwoElemetsThatMakesNeededNumberV3(arr1, k1)));
        System.out.println(Arrays.toString(subArrayOfTwoElemetsThatMakesNeededNumberV3(arr2, k2)));
        System.out.println(Arrays.toString(subArrayOfTwoElemetsThatMakesNeededNumberV3(arr3, k3)));
        System.out.println(Arrays.toString(subArrayOfTwoElemetsThatMakesNeededNumberV3(arr4, k4)));
        System.out.println(Arrays.toString(subArrayOfTwoElemetsThatMakesNeededNumberV3(arr5, k5)));
    }

    // Time O(nlogn) Memory O(1)
    public static int[] subArrayOfTwoElemetsThatMakesNeededNumberV3(int[] testArray, int neededNumber) {

        for (int i = 0; i < testArray.length; i++) {
            int pair = neededNumber - testArray[i];
            int low = i + 1;
            int high = testArray.length - 1;

            while (low <= high) {
                int middle = low + (high - low) / 2;

                if (testArray[middle] == pair) {
                    return new int[]{pair, testArray[i]};
                }
                if (pair > testArray[middle]) {
                    low = middle + 1;
                } else {
                    high = middle - 1;
                }
            }
        }
        return new int[]{};
    }


}

