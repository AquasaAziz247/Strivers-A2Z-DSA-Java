import java.util.*;

public class Solution {

    public static int longestSubarrayWithSumK(int[] a, long k) {

        HashMap<Long, Integer> prefixSumMap = new HashMap<>();

        long sum = 0;
        int maxLen = 0;

        for (int i = 0; i < a.length; i++) {

            // Add current element to prefix sum
            sum += a[i];

            // Case 1: Subarray starts from index 0
            if (sum == k) {
                maxLen = Math.max(maxLen, i + 1);
            }

            // We need an earlier prefix sum = sum - k
            long rem = sum - k;

            if (prefixSumMap.containsKey(rem)) {
                int prevIndex = prefixSumMap.get(rem);

                int len = i - prevIndex;

                maxLen = Math.max(maxLen, len);
            }

            // Store only the FIRST occurrence of this prefix sum
            // because it gives the longest possible subarray later.
            if (!prefixSumMap.containsKey(sum)) {
                prefixSumMap.put(sum, i);
            }
        }

        return maxLen;
    }
}

TC : O(N)
  SC : O(1)
