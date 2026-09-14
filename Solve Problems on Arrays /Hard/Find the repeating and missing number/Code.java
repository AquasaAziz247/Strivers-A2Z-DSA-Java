class Solution {
    public int[] findMissingRepeatingNumbers(int[] nums) {

        long n = nums.length;

        // Sum of 1 to N
        long Sn = (n * (n + 1)) / 2;

        // Sum of squares of 1 to N
        long S2n = (n * (n + 1) * (2 * n + 1)) / 6;

        long S = 0;
        long S2 = 0;

        // Calculate actual sum and sum of squares
        for (int i = 0; i < n; i++) {
            S += nums[i];
            S2 += (long) nums[i] * nums[i];
        }

        // x - y
        long val1 = S - Sn;

        // x² - y²
        long val2 = S2 - S2n;

        // x + y
        val2 = val2 / val1;

        // x = repeating, y = missing
        long x = (val1 + val2) / 2;
        long y = x - val1;

        return new int[]{(int) x, (int) y};
    }
}


Complexity
Time: O(N)
Space: O(1)
