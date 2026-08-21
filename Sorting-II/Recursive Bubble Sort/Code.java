class Solution {
    public int[] bubbleSort(int[] nums) {
        bubble(nums, nums.length);
        return nums;
    }

    private void bubble(int[] nums, int n) {
        if (n <= 1) {
            return;
        }

        for (int i = 0; i < n - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                int temp = nums[i];
                nums[i] = nums[i + 1];
                nums[i + 1] = temp;
            }
        }

        bubble(nums, n - 1);
    }
}
