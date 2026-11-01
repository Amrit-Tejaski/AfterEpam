package in.slidingwindows.concept;

public class MaximumSumSubarrayofSizeK {

    static int maximumSumSubarrayofSizeK(int [] arr, int k) {
        int n = arr.length;
        if (n < k) return 0;
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        int maxSum = sum;
        for (int j = 1; j < n-k; j++) {
            sum = sum - arr[j - 1] + arr[j + k - 1];  // Add incoming, subtract outgoing
            if (sum > maxSum) {
                maxSum = sum;
            }
        }

        return maxSum;


    }

    public static void main(String[] args) {

        int [] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;

        int result  = maximumSumSubarrayofSizeK(arr, k);
        System.out.println(result);
    }
}
