package in.slidingwindows.concept;

import java.util.Arrays;

public class MaxValueInEachWindow {


    public static void main(String[] args) {
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        int[] ints = maxSlidingWindow(nums, k);
        System.out.println(Arrays.toString(ints));
    }

    static int[] maxSlidingWindow(int[] nums, int k) {

        int n = nums.length;
        int[] result = new int[n - k + 1];

        int max = 0;
        for (int i = 0; i < n - k; i++) {

            int currentMax = nums[i];


            for (int j = 1; j < k; j++) {

                if (nums[i + j] > currentMax) {
                    currentMax = nums[i + j];
                }

            }
            result[i] = max;
        }
        return result;
    }
}