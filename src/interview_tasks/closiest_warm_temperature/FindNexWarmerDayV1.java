package interview_tasks.closiest_warm_temperature;

/*
Given an array of integers temperatures represents the daily temperatures,
return an array answer such that answer[i] is the number of days you have to wait after the ith day to get a warmer temperature.
If there is no future day for which this is possible, keep answer[i] == 0 instead.

Example 1:

Input: temperatures = [73,74,75,71,69,72,76,73]
Output: [1,1,4,2,1,1,0,0]
Example 2:

Input: temperatures = [30,40,50,60]
Output: [1,1,1,0]
Example 3:

Input: temperatures = [30,60,90]
Output: [1,1,0]


Constraints:

1 <= temperatures.length <= 105
30 <= temperatures[i] <= 100
 */

import java.util.Arrays;

public class FindNexWarmerDayV1 {

    static int[] temperatures1 = {73, 74, 75, 71, 69, 72, 76, 73};
    static int[] temperatures2 = {30, 40, 50, 60};
    static int[] temperatures3 = {30, 60, 90};

    public static void main(String[] args) {

        System.out.println(Arrays.toString(dailyTemperatures(temperatures1)));
        System.out.println(Arrays.toString(dailyTemperatures(temperatures2)));
        System.out.println(Arrays.toString(dailyTemperatures(temperatures3)));
    }

    public static int[] dailyTemperatures(int[] temps) {
        int[] nearestWarmerDayToCount = new int[temps.length];

        for (int i = 0; i < temps.length; i++) {
            for (int j = i + 1; j < temps.length; j++) {
                if (temps[j] > temps[i]) {
                    nearestWarmerDayToCount[i] = j - i;
                    break;
                }
            }
        }
        return nearestWarmerDayToCount;
    }
}
