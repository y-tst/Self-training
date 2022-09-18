package interview_tasks.fibonacci;

import java.util.Arrays;

public class FibonacciGenerator {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(fibonacci(10)));
    }

    public static int[] fibonacci(int n) {
        int[] fiboArray = new int[n];

        Arrays.fill(fiboArray, 1);
        fiboArray[0] = 0;

        for (int i = 2; i < n; i++) {

            fiboArray[i] = fiboArray[i - 1] + fiboArray[i - 2];
        }

        return fiboArray;
    }
}
