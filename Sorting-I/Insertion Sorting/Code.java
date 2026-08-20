import java.util.Arrays;

class Solution {

    public int[] insertionSort(int[] nums) {
        int n = nums.length;

        for (int i = 0; i <= n - 1; i++) {
            int j = i;

            while (j > 0 && nums[j - 1] > nums[j]) {

                int temp = nums[j - 1];
                nums[j - 1] = nums[j];
                nums[j] = temp;

                j--;
            }
        }

        return nums;
    }

    public static void main(String[] args) {

        int[] nums = {5, 3, 4, 1, 2};

        Solution obj = new Solution();

        int[] result = obj.insertionSort(nums);

        System.out.println("Sorted array: " + Arrays.toString(result));
    }
}
