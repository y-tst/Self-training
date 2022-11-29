package interview_tasks.exact_sum_from_two_elements_of_array;

/*
Return the array of two elements from current array, that makes needed number by sum
If there is no exact sum - return more close sum
 !!!Array is sorted
 */

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ExactSumV5orClosiest {

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
        customMapToString(subArrayOfTwoElemetsThatMakesNeededNumberV4(arr1, k1));
        customMapToString(subArrayOfTwoElemetsThatMakesNeededNumberV4(arr2, k2));
        customMapToString(subArrayOfTwoElemetsThatMakesNeededNumberV4(arr3, k3));
        customMapToString(subArrayOfTwoElemetsThatMakesNeededNumberV4(arr4, k4));
        customMapToString(subArrayOfTwoElemetsThatMakesNeededNumberV4(arr5, k5));
    }

    // Time O(n) Memory O(1) - using 2 pointers - best variant
    public static Map<Integer[], Boolean> subArrayOfTwoElemetsThatMakesNeededNumberV4(int[] testArray, int neededNumber) {

        Map<Integer[], Boolean> map = new HashMap<>();
        map.put(new Integer[]{}, false);

        int first = 0;
        int second = testArray.length - 1;
        int difference = testArray[second] + testArray[first];

        while (first != second) {
            if (testArray[second] + testArray[first] == neededNumber) {
                map.clear();
                map.put(new Integer[]{testArray[first], testArray[second]}, true);
                return map;
            }

            if (Math.abs(neededNumber - (testArray[second] + testArray[first])) < difference) {
                map.clear();
                map.put(new Integer[]{testArray[first], testArray[second]}, false);
            }

            if (testArray[second] + testArray[first] < neededNumber) {
                first++;
            } else second--;
        }

        return map;

    }

    public static void customMapToString(Map<Integer[], Boolean> map) {
        for (Map.Entry<Integer[], Boolean> mapElements : map.entrySet()) {
            System.out.println(Arrays.toString(mapElements.getKey()) + " is exact pair - " + mapElements.getValue());
        }

    }
}

