package interviewTasks.flattenArrayFromFewArrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class FlattenArray {

    static int[] arr1 = {1, 2, 3};
    static int[] arr2 = {1, 2};
    static int[] arr3 = {1};
    static int[] arr4 = {1, 0};

    static int[][] testArrayOfArrays = {arr1, arr2, arr3, arr4};

    public static void main(String[] args) {

        System.out.println(Arrays.toString(flattenarray(testArrayOfArrays)));

    }

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
}
