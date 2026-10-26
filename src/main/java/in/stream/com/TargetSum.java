package in.stream.com;

import java.util.Arrays;

public class TargetSum {

    static int[] twoSum(int [] arr, int target){
        int left = 0;
        int right = arr.length-1;

        while (left<right){

            int sum = arr[left]+arr[right];

            if(sum == target){

                System.out.println(left +" "+right);
                left++;
                right--;
            }

            if(sum<target){
                left++;
            } else {
                right--;
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int [] arr = {10,20,30,40,50};
        int target= 70;
        twoSum(arr, target);
    }
}
