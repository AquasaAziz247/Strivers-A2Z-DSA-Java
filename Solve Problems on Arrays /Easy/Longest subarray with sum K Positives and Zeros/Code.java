public class Solution {

    public static int longestSubarrayWithSumK(int[] a, long k) {

        int n = a.length;

        int left = 0;
        int right = 0;

        long sum = a[0];
        int maxLen = 0;

        while (right < n) {

            // If sum is greater than k,
            // remove elements from the left.
            while (left <= right && sum > k) {
                sum -= a[left];
                left++;
            }

            // If current window sum is k,
            // update the maximum length.
            if (sum == k) {
                maxLen = Math.max(maxLen, right - left + 1);
            }

            // Move right pointer forward.
            right++;

            // Add the new element to the window.
            if (right < n) {
                sum += a[right];
            }
        }

        return maxLen;
    }
}


Time  = O(n)
Space = O(1)
