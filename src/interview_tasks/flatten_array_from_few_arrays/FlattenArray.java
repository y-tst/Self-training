package interview_tasks.flatten_array_from_few_arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FlattenArray {

    static int[] arr1 = {1, 2, 3};
    static int[] arr2 = {1, 2};
    static int[] arr3 = {1};
    static int[] arr4 = {1, 0};

    static int[][] testArrayOfArrays = {arr1, arr2, arr3, arr4};

    public static void main(String[] args) {

        System.out.println(Arrays.toString(flattenarray(testArrayOfArrays)));
        System.out.println();
        System.out.println(Arrays.toString(flattenarrayV2(testArrayOfArrays)));
        System.out.println();
//        System.out.println(Arrays.toString(flattenarrayV3(testArrayOfArrays)));

    }

    // var1:
    static int[] flattenarray(int[][] arrayOfArrays) {

        int resArrayLength = 0;

        for (int i = 0; i < arrayOfArrays.length; i++) {
            resArrayLength += arrayOfArrays[i].length;
        }

        int[] resAray = new int[resArrayLength];
        int pos = 0;

        for (int i = 0; i < arrayOfArrays.length; i++) {
            for (int elemennt : arrayOfArrays[i]) {
                resAray[pos] = elemennt;
                pos++;
            }
        }
        return resAray;
    }

    // var2 (using colllections):

    static int[] flattenarrayV2(int[][] arrayOfArrays) {

        List list = new ArrayList();

        for (int i = 0; i < arrayOfArrays.length; i++) {
            for (int elemennt : arrayOfArrays[i]) {
                list.addAll(Arrays.asList(elemennt));
            }
        }

//        Object[] resList = list.toArray().a;

        return list.stream().mapToInt(j -> (int) j).toArray();
    }

}


//// var3 (using streams):
//example:
//public class MergeArrayExample5
//{
//    // function to merge two arrays
//    public static <T> Object[] mergeArray(T[] arr1, T[] arr2)
//    {
//        return Stream.of(arr1, arr2).flatMap(Stream::of).toArray();
//    }
//    public static void main (String[] args)
//    {
//        Integer[] firstArray = new Integer[]{13,12,11,6,9,3}; //source array
//        Integer[] secondArray = new Integer[]{78,34,56,67,2,11,7}; //destination array
//        Object[] mergedArray = mergeArray(firstArray,secondArray); //merged array
//        System.out.println("Merged array: "+ Arrays.toString(mergedArray));
//    }
//}
//
//    static int[] flattenarrayV3(int[][] arrayOfArrays) {
//
////        int resArrayLength = 0;
////
////        for (int i = 0; i < arrayOfArrays.length; i++) {
////            resArrayLength += arrayOfArrays[i].length;
////        }
//
//        return Arrays.stream(Stream.of(Stream.of(arrayOfArrays)).flatMap(Stream::of).toArray()).mapToInt(j -> (int) j).toArray();
//    }
//}
