package interview_tasks.rotate_matrix;

import java.util.Arrays;

public class PrintIntMatrix {

    public static void printIntMatrix(int[][] matrixTobePrinted) {
        for (int[] ints : matrixTobePrinted) {
            System.out.println(Arrays.toString(ints));
        }
    }
}
