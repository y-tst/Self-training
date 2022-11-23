package interview_tasks.exact_sum_from_two_elements_of_array;

/*
Return the array of two elements from current array, that makes needed number by sum  !!!Array is sorted
 */

import java.util.Arrays;

public class ExactSumV4 {

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
        System.out.println(Arrays.toString(subArrayOfTwoElemetsThatMakesNeededNumberV4(arr1, k1)));
        System.out.println(Arrays.toString(subArrayOfTwoElemetsThatMakesNeededNumberV4(arr2, k2)));
        System.out.println(Arrays.toString(subArrayOfTwoElemetsThatMakesNeededNumberV4(arr3, k3)));
        System.out.println(Arrays.toString(subArrayOfTwoElemetsThatMakesNeededNumberV4(arr4, k4)));
        System.out.println(Arrays.toString(subArrayOfTwoElemetsThatMakesNeededNumberV4(arr5, k5)));
    }

    // Time O(n) Memory O(1) - using 2 pointers - best variant
    public static int[] subArrayOfTwoElemetsThatMakesNeededNumberV4(int[] testArray, int neededNumber) {

        int first = 0;
        int second = testArray.length - 1;

        while (first != second) {
            if (testArray[second] + testArray[first] == neededNumber) {
                return new int[]{testArray[first], testArray[second]};
            } else if (testArray[second] + testArray[first] < neededNumber) {
                first++;
            } else second--;
        }

        return new int[]{};
    }


}

