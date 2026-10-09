class Solution {
    public int minDays(int[] bloomDay, int m, int k) {

        // Impossible to make m bouquets
        // because each bouquet needs k flowers
        long required = (long) m * k;

        if (required > bloomDay.length) {
            return -1;
        }

        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;

        // Minimum and maximum possible days
        for (int day : bloomDay) {
            low = Math.min(low, day);
            high = Math.max(high, day);
        }

        // Binary Search on the answer (number of days)
        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (canMake(bloomDay, mid, m, k)) {
                // Possible to make m bouquets.
                // Try an earlier day.
                high = mid - 1;
            } else {
                // Not possible yet.
                // Need more days.
                low = mid + 1;
            }
        }

        return low;
    }

    private boolean canMake(int[] bloomDay, int day, int m, int k) {

        int flowers = 0;
        int bouquets = 0;

        for (int bloom : bloomDay) {

            if (bloom <= day) {
                flowers++;

                // k consecutive bloomed flowers
                if (flowers == k) {
                    bouquets++;
                    flowers = 0;

                    if (bouquets == m) {
                        return true;
                    }
                }

            } else {
                // Break in consecutive flowers
                flowers = 0;
            }
        }

        return false;
    }
}
