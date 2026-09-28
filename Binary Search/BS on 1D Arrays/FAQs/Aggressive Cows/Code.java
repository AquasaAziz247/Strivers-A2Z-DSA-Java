import java.util.Arrays;

class Solution {
    public int aggressiveCows(int[] nums, int k) {
        Arrays.sort(nums);

        int low = 1;
        int high = nums[nums.length - 1] - nums[0];
        int ans = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (canPlace(nums, mid, k)) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return ans;
    }

    private boolean canPlace(int[] nums, int dist, int k) {
        int count = 1;
        int last = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] - last >= dist) {
                count++;
                last = nums[i];
            }

            if (count >= k) {
                return true;
            }
        }

        return false;
    }
}
