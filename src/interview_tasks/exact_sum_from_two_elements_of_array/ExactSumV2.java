package interview_tasks.exact_sum_from_two_elements_of_array;

/*
Return the array of two elements from current array, that makes needed number by sum  !!!Array is sorted
 */

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ExactSumV2 {

    static int[] arr1 = {-1, 2, 5, 8};
    static int k1 = 7;         // -> [2, 5]

    static int[] arr2 = {-3, -1, 0, 2, 6};
    static int k2 = 6;         // -> [0, 6]

    static int[] arr3 = {2, 4, 5};
    static int k3 = 8;          // -> []

    static int[] arr4 = {-2, -1, 1, 2};
    static int k4 = 0;           // -> [-2, 2]  (first of two possible solutions)

    public static void main(String[] args) {
        System.out.println(Arrays.toString(subArrayOfTwoElemetsThatMakesNeededNumberV2(arr1, k1)));
        System.out.println(Arrays.toString(subArrayOfTwoElemetsThatMakesNeededNumberV2(arr2, k2)));
        System.out.println(Arrays.toString(subArrayOfTwoElemetsThatMakesNeededNumberV2(arr3, k3)));
        System.out.println(Arrays.toString(subArrayOfTwoElemetsThatMakesNeededNumberV2(arr4, k4)));
    }

    // Time O(n) Memory O(n)
    public static int[] subArrayOfTwoElemetsThatMakesNeededNumberV2(int[] testArray, int neededNumber) {
        Set<Integer> processing = new HashSet<>();
        for (int i = 0; i < testArray.length; i++) {
            if (processing.contains(neededNumber - testArray[i])) {
                return new int[]{neededNumber - testArray[i], testArray[i]};
            } else processing.add(testArray[i]);


        }
        return new int[]{};

    }
}
