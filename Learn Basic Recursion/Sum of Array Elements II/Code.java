class Solution {
    private int sum(int[] nums, int n){
        if (n==0){
            return 0;
        }
        return nums[n-1]+sum(nums,n-1);
    }
    public int arraySum(int[] nums) {
        //your code goes here
        return sum(nums,nums.length);
    }
}
