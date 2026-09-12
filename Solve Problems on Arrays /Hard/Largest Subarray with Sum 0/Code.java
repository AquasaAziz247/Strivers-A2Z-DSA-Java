class Solution {
    public int maxLen(int[] arr) {
        
        HashMap<Integer, Integer> mpp = new HashMap<>();
        
        int maxLen = 0;
        int sum = 0;
        
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            
            // If sum is 0, subarray from 0 to i has sum 0
            if (sum == 0) {
                maxLen = i + 1;
            }
            
            // If this prefix sum appeared before
            else if (mpp.containsKey(sum)) {
                maxLen = Math.max(maxLen, i - mpp.get(sum));
            }
            
            // Store only the first occurrence
            else {
                mpp.put(sum, i);
            }
        }
        
        return maxLen;
    }
}


TC : O(NLOGN)
SC : O(N)  
