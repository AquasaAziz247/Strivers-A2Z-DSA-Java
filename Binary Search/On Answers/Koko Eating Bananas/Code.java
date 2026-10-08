class Solution {

    public int minEatingSpeed(int[] piles, int h) {

        int low = 1;
        int high = 0;

        // Find maximum pile
        for (int pile : piles) {
            high = Math.max(high, pile);
        }

        // Binary Search on eating speed
        while (low <= high) {

            int mid = low + (high - low) / 2;

            long totalHours = calculateHours(piles, mid);

            if (totalHours <= h) {
                // mid is a possible answer
                // Try to find a smaller speed
                high = mid - 1;
            } else {
                // mid is too slow
                low = mid + 1;
            }
        }

        return low;
    }

    private long calculateHours(int[] piles, int speed) {

        long hours = 0;

        for (int pile : piles) {
            // Equivalent to ceil(pile / speed)
            hours += (pile + (long) speed - 1) / speed;
        }

        return hours;
    }
}
