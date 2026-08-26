class Solution {
    public int linearSearch(int nums[], int target) {
		//Your code goes here
        int result=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                result=i;
                break;
            }
        }
        return result;
    }
}
TC : O(N)
SC : O(1) 
