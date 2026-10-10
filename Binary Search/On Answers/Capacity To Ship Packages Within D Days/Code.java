class Solution {

    // Checks how many days are required for a given capacity
    private int findDays(int[] weights, int capacity) {
        int days = 1;
        int load = 0;

        for (int weight : weights) {

            if (load + weight > capacity) {
                days++;
                load = weight;
            } else {
                load += weight;
            }
        }

        return days;
    }

    public int shipWithinDays(int[] weights, int days) {

        int low = 0;
        int high = 0;

        // Minimum possible capacity = maximum package weight
        // Maximum possible capacity = sum of all package weights
        for (int weight : weights) {
            low = Math.max(low, weight);
            high += weight;
        }

        // Binary Search on capacity
        while (low <= high) {

            int mid = low + (high - low) / 2;

            int requiredDays = findDays(weights, mid);

            if (requiredDays <= days) {
                // This capacity works.
                // Try to find an even smaller capacity.
                high = mid - 1;
            } else {
                // Capacity is too small.
                // Need a larger capacity.
                low = mid + 1;
            }
        }

        return low;
    }
}
