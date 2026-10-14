class Solution {

    static final long MOD = 10000003;

    public int paint(int A, int B, int[] C) {

        long low = 0;
        long high = 0;

        // Search space:
        // Minimum = largest board
        // Maximum = sum of all boards
        for (int board : C) {
            low = Math.max(low, board);
            high += board;
        }

        while (low <= high) {

            long mid = low + (high - low) / 2;

            if (canPaint(C, A, mid)) {
                // Possible with this maximum workload.
                // Try to reduce it.
                high = mid - 1;
            } else {
                // Need more painters.
                // Increase the allowed workload.
                low = mid + 1;
            }
        }

        // Minimum time = maximum board workload × time per unit
        return (int) ((low * B) % MOD);
    }

    private boolean canPaint(int[] C, int painters, long maxWork) {

        int usedPainters = 1;
        long currentWork = 0;

        for (int board : C) {

            if (currentWork + board <= maxWork) {
                currentWork += board;
            } else {

                usedPainters++;
                currentWork = board;

                if (usedPainters > painters) {
                    return false;
                }
            }
        }

        return true;
    }
}
