class Solution {

    public int firstOccurrence(int[] arr, int k) {
        int low = 0;
        int high = arr.length - 1;
        int first = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == k) {
                first = mid;
                high = mid - 1;   // search further left
            }
            else if (arr[mid] < k) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }

        return first;
    }

    public int lastOccurrence(int[] arr, int k) {
        int low = 0;
        int high = arr.length - 1;
        int last = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == k) {
                last = mid;
                low = mid + 1;    // search further right
            }
            else if (arr[mid] < k) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }

        return last;
    }

    public int[] searchRange(int[] nums, int target) {

        int first = firstOccurrence(nums, target);

        // target not present
        if (first == -1) {
            return new int[]{-1, -1};
        }

        int last = lastOccurrence(nums, target);

        return new int[]{first, last};
    }
}
