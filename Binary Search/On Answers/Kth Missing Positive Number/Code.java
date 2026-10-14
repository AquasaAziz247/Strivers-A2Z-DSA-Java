class Solution {
    public int findKthPositive(int[] arr, int k) {

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            // Number of missing positive integers before arr[mid]
            int missing = arr[mid] - (mid + 1);

            if (missing < k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        // Answer = k + number of elements before the answer
        return k + high + 1;
    }
}
