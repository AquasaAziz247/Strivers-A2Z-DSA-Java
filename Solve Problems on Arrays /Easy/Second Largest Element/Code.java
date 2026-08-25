class Solution {
    public int secondLargestElement(int[] nums) {
        int l = Integer.MIN_VALUE;
        int sl = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] > l) {
                sl = l;
                l = nums[i];
            } 
            else if (nums[i] > sl && nums[i] < l) {
                sl = nums[i];
            }
        }

        // No distinct second largest element
        if (sl == Integer.MIN_VALUE) {
            return -1;
        }

        return sl;
    }
} 

TC : 0(N)
SC : O(1)       
