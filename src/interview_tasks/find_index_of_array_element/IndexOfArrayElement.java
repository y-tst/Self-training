package interview_tasks.find_index_of_array_element;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IndexOfArrayElement {

//    console.log(search([1, 3, 6, 13, 17], 13)) // -> 3
//    console.log(search([1, 3, 6, 13, 17], 12)) // -> -1//    console.log(search([1, 3, 6, 13, 17], 22)) // -> -1

    public static void main(String[] args) {

        int[] testArray = {1, 3, 6, 13, 17};

        System.out.println(elementIndex(testArray, 13));
        System.out.println(elementIndex(testArray, 12));
        System.out.println(elementIndex(testArray, 22));
        System.out.println();
        System.out.println(elementIndexV2(testArray, 13));
        System.out.println(elementIndexV2(testArray, 12));
        System.out.println(elementIndexV2(testArray, 22));
        System.out.println();
        System.out.println(elementIndexV3(testArray, 13));
        System.out.println(elementIndexV3(testArray, 12));
        System.out.println(elementIndexV3(testArray, 22));
    }

    // O[n]
    public static int elementIndex(int[] sourceArray, int element) {

        for (int i = 0; i < sourceArray.length; i++) {
            if (sourceArray[i] == element) {
                return i;
            }
        }

        return -1;
    }

    // O[log(n)]
    public static int elementIndexV2(int[] sourceArray, int element) {

        int start = 0;
        int finish = sourceArray.length - 1;

        if (sourceArray[start] > element || sourceArray[finish] < element)
            return -1;

        while (true) {

            if (sourceArray[start] == element) {
                return start;
            }

            if (sourceArray[finish] == element) {
                return finish;
            }

            if (finish - start <= 1) {
                return -1;
            }

            int middle = Math.round((start + finish) / 2);

            if (element < middle) {
                finish = middle;
            } else if (element > middle) {
                start = middle;
            } else return middle;
        }
    }

    // O ??
    public static int elementIndexV3(int[] sourceArray, int element) {

        List<Integer> integerList = Arrays.stream(sourceArray).boxed().collect(Collectors.toList());

        return integerList.indexOf(element);
    }
}
