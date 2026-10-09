import java.util.*;

class Solution {
    public int sumHighestAndLowestFrequency(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequency of each element
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int maxFreq = 0;
        int minFreq = nums.length;

        // Find highest and lowest frequencies
        for (int freq : map.values()) {
            maxFreq = Math.max(maxFreq, freq);
            minFreq = Math.min(minFreq, freq);
        }

        return maxFreq + minFreq;
    }
}
