package algorithmsAndDataStructures;

import java.util.Arrays;
import java.util.Collections;

public class MaxDistanseByFuel {

    public static void main(String[] args) {
        int[] stationPoints = {0, 200, 375, 550, 750, 950};
        System.out.println(minStops(stationPoints, 400));  // 400km max for full tank
    }

    // returns -1 if it's not impossible to get next station because not enough capacity
    public static int minStops(int[] stationPoints, int capacity) {
        int result = 0;
        int currentStop = 0;

        while (currentStop < stationPoints.length - 1) {
            int nextStop = currentStop;

            while (nextStop < stationPoints.length - 1 &&
                    stationPoints[nextStop + 1] - stationPoints[currentStop] <= capacity)
                nextStop++;

            if (currentStop == nextStop)
                return -1;

            if (nextStop < stationPoints.length - 1)
                result++;

            currentStop = nextStop;
        }

        return result;
    }

}
