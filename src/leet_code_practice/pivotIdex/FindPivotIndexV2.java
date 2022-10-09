package leet_code_practice.pivotIdex;

public class FindPivotIndexV2 {

    public static void main(String[] args) {
        System.out.println("Pivot index for [1,7,3,6,5,6] is: " + pivotIndex(new int[]{1, 7, 3, 6, 5, 6}));
    }

    static public int pivotIndex(int[] nums) {

        int pivotIndex = -1;

        int[] sumArrayStraight = new int[nums.length];
        int[] sumArrayBackward = new int[nums.length];

        int currentNumStraight = 0;
        int currentNumBackward = 0;

        for (int i = 0; i < nums.length; i++) {
            sumArrayStraight[i] = currentNumStraight + nums[i];
            sumArrayBackward[nums.length - 1 - i] = currentNumBackward + nums[nums.length - 1 - i];
            currentNumStraight += nums[i];
            currentNumBackward += nums[nums.length - 1 - i];


        }

        for (int k = 0; k < nums.length; k++) {
            if (sumArrayStraight[k] == sumArrayBackward[k]) {
                pivotIndex = k;
                break;
            }
        }

        return pivotIndex;
    }
}
