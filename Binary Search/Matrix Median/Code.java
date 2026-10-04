class Solution {

    // Returns the number of elements <= x in a sorted row
    private int upperBound(int[] row, int x) {
        int low = 0;
        int high = row.length;

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (row[mid] <= x) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        return low;
    }

    public int findMedian(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        // Minimum possible value
        int low = matrix[0][0];

        // Maximum possible value
        int high = matrix[0][cols - 1];

        for (int i = 1; i < rows; i++) {
            low = Math.min(low, matrix[i][0]);
            high = Math.max(high, matrix[i][cols - 1]);
        }

        // Number of elements that should be <= median
        int required = (rows * cols) / 2;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            int count = 0;

            // Count elements <= mid
            for (int i = 0; i < rows; i++) {
                count += upperBound(matrix[i], mid);
            }

            if (count <= required) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return low;
    }
}
