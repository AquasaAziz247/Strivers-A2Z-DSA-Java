class Solution {
    public int findKRotation(ArrayList<Integer> nums) {

        int low = 0;
        int high = nums.size() - 1;

        int min = Integer.MAX_VALUE;
        int index = -1;

        while (low <= high) {

            // If current range is already sorted
            if (nums.get(low) <= nums.get(high)) {
                if (nums.get(low) < min) {
                    min = nums.get(low);
                    index = low;
                }
                break;
            }

            int mid = low + (high - low) / 2;

            // Left half is sorted
            if (nums.get(low) <= nums.get(mid)) {

                if (nums.get(low) < min) {
                    min = nums.get(low);
                    index = low;
                }

                low = mid + 1;
            }

            // Right half is sorted
            else {

                if (nums.get(mid) < min) {
                    min = nums.get(mid);
                    index = mid;
                }

                high = mid - 1;
            }
        }

        return index;
    }
}


Complexity
Time: O(log n)
Space: O(1)
