package in.slidingwindows.concept;

import java.util.Arrays;

public class MaxSlidingWindowValue {

    public static int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k <= 0) {
            System.out.println("Invalid input!");
            return new int[0];
        }
        int n = nums.length;
        int[] result = new int[n-k+1];

        for(int i = 0; i<=n-k; i++){

            int max = nums[i];

            for(int j = i; j<k+i; j++){

                if(nums[j]>max){
                    max = nums[j];
                }
            }
            result[i]= max;

        }

            return result;
    }
    public static void main(String[] args) {
        int[] nums = {1,3,-1,-3,5,3,6,7};
        int k = 3;
        int[] ints = maxSlidingWindow(nums, k);
        System.out.println(Arrays.toString(ints));


    }
}
