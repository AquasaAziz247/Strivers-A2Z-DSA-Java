import java.util.*;

class Solution {
    public List<List<Integer>> countFrequencies(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequency
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Create answer
        List<List<Integer>> ans = new ArrayList<>();

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            List<Integer> pair = new ArrayList<>();

            pair.add(entry.getKey());      // element
            pair.add(entry.getValue());    // frequency

            ans.add(pair);
        }

        return ans;
    }
}

TC : O(N)
SC : O(N)  
