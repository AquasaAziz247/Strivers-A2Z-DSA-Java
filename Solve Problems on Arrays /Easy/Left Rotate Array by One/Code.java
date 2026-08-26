class Solution {
    public void rotateArrayByOne(int[] nums) {
        reverse(nums,1,nums.length-1);
        reverse(nums,0,nums.length-1);
    }
    private void reverse(int[] nums,int start, int end){
        while(start<end){
            int temp=nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
        }
}
