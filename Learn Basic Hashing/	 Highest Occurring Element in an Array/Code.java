class Solution {
    public int mostFrequentElement(int[] nums) {
        HashMap<Integer, Integer> freq = new HashMap<>();

        int answer = nums[0];
        int maxFreq =0;
        for(int num: nums){
            freq.put(num,freq.getOrDefault(num,0)+1);
        
        int currentFreq=freq.get(num);

        if(currentFreq>maxFreq || currentFreq==maxFreq && num<answer){
            maxFreq = currentFreq;
            answer = num;
        }
        }
        return answer;
    }
}

TC : O(N)
SC : O(N)  
