package interview_tasks.find_index_of_array_element;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IndexOfArrayElement {

//    console.log(search([1, 3, 6, 13, 17], 13)) // -> 3
//    console.log(search([1, 3, 6, 13, 17], 12)) // -> -1

    public static void main(String[] args) {

        int[] testArray = {1, 3, 6, 13, 17};

        System.out.println(elementIndex(testArray, 13));
        System.out.println(elementIndex(testArray, 12));
        System.out.println();
        System.out.println(elementIndexV2(testArray, 13));
        System.out.println(elementIndexV2(testArray, 12));
    }

    public static int elementIndex(int[] sourceArray, int element) {

        int index = -1;

        for (int i = 0; i < sourceArray.length; i++) {
            if (sourceArray[i] == element) {
                index = i;
            }
        }

        return index;
    }

    public static int elementIndexV2(int[] sourceArray, int element) {

        List<Integer> integerList = Arrays.stream(sourceArray).boxed().collect(Collectors.toList());

        return integerList.indexOf(element);
    }
}
