public class Solution {
    public static void maxSubArray(int[] nums) {

        int maxSum = Integer.MIN_VALUE;
        int sum = 0;

        int start = 0;
        int ansStart = -1;
        int ansEnd = -1;

        for (int i = 0; i < nums.length; i++) {

            // Start a new subarray
            if (sum == 0) {
                start = i;
            }

            sum += nums[i];

            // Update maximum
            if (sum > maxSum) {
                maxSum = sum;
                ansStart = start;
                ansEnd = i;
            }

            // Reset if sum becomes negative
            if (sum < 0) {
                sum = 0;
            }
        }

        // Print maximum sum
        System.out.println("Maximum Sum = " + maxSum);

        // Print subarray
        System.out.print("Subarray = ");

        for (int i = ansStart; i <= ansEnd; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
