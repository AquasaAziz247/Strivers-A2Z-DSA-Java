class Solution {
    public int longestSubarray(int[] nums, int k) {
       HashMap<Long,Integer> prefixSum = new HashMap<>();
       long sum=0;
       int maxLen=0;
       for(int i=0;i<nums.length;i++){
        sum+=nums[i];

        if(sum==k){
            maxLen=Math.max(maxLen,i+1);
        }
        long rem = sum-k;
        if(prefixSum.containsKey(rem)){
            int prevIndex= prefixSum.get(rem);
            int len= i-prevIndex;
            maxLen = Math.max(maxLen,len);
        }

        if(!prefixSum.containsKey(sum)){
            prefixSum.put(sum,i);
        }
       }
       return maxLen;
    }


TC : O(N)
  SC : O(1)
