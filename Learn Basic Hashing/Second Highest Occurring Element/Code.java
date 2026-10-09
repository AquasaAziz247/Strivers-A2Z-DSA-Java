import java.util.*;

class Solution {
    public int secondMostFrequentElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        // Step 1: Count frequency
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int maxFreq = 0;
        int secondMaxFreq = 0;

        // Step 2: Find the highest and second-highest frequencies
        for (int freq : map.values()) {
            if (freq > maxFreq) {
                secondMaxFreq = maxFreq;
                maxFreq = freq;
            } else if (freq < maxFreq && freq > secondMaxFreq) {
                secondMaxFreq = freq;
            }
        }

        // Step 3: Return the smallest element with secondMaxFreq
        if (secondMaxFreq == 0) {
            return -1;
        }

        int ans = Integer.MAX_VALUE;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == secondMaxFreq) {
                ans = Math.min(ans, entry.getKey());
            }
        }

        return ans;
    }
}
