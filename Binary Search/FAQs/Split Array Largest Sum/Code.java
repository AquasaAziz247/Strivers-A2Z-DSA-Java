class Solution {

    public int splitArray(int[] nums, int k) {

        int low = 0;
        long high = 0;

        // Minimum possible answer = largest element
        // Maximum possible answer = total sum
        for (int num : nums) {
            low = Math.max(low, num);
            high += num;
        }

        while (low <= high) {

            long mid = low + (high - low) / 2;

            int parts = countParts(nums, mid);

            if (parts > k) {
                // Too many subarrays
                // We need to allow a larger sum
                low = (int) mid + 1;
            } else {
                // We can split into k or fewer parts
                // Try to minimize the maximum sum
                high = mid - 1;
            }
        }

        return low;
    }

    private int countParts(int[] nums, long maxSum) {

        int parts = 1;
        long currentSum = 0;

        for (int num : nums) {

            if (currentSum + num <= maxSum) {
                currentSum += num;
            } else {
                parts++;
                currentSum = num;
            }
        }

        return parts;
    }
}
