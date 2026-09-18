class Solution {
    public int[] getFloorAndCeil(int[] nums, int x) {
        
        int n = nums.length;
        int low = 0;
        int high = n - 1;
        
        int floor = -1;
        int ceil = -1;

        // Find floor
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] <= x) {
                floor = nums[mid];
                low = mid + 1;
            } 
            else {
                high = mid - 1;
            }
        }

        // Find ceil
        low = 0;
        high = n - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] >= x) {
                ceil = nums[mid];
                high = mid - 1;
            } 
            else {
                low = mid + 1;
            }
        }

        return new int[]{floor, ceil};
    }
}


Complexity	Value
Time	O(log n)
Space	O(1)
