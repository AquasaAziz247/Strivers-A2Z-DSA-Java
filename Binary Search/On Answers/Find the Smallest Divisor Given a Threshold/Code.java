class Solution {

    public int smallestDivisor(int[] nums, int threshold) {

        int low = 1;
        int high = 0;

        // Find maximum element
        for (int num : nums) {
            high = Math.max(high, num);
        }

        // Binary Search
        while (low <= high) {

            int mid = low + (high - low) / 2;

            int sum = 0;

            for (int num : nums) {

                // Ceiling of num / mid
                sum += (num + mid - 1) / mid;

                // Optional optimization
                if (sum > threshold) {
                    break;
                }
            }

            if (sum <= threshold) {
                // mid is a possible answer
                // Try to find a smaller divisor
                high = mid - 1;
            } else {
                // Need a larger divisor
                low = mid + 1;
            }
        }

        return low;
    }
}
