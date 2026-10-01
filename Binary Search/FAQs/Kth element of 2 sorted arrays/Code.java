class Solution {
    public int kthElement(int[] a, int[] b, int k) {
        int n1 = a.length;
        int n2 = b.length;

        // Always binary search on the smaller array
        if (n1 > n2) {
            return kthElement(b, a, k);
        }

        int low = Math.max(0, k - n2);
        int high = Math.min(k, n1);

        while (low <= high) {
            int mid1 = low + (high - low) / 2;
            int mid2 = k - mid1;

            int l1 = (mid1 == 0) ? Integer.MIN_VALUE : a[mid1 - 1];
            int l2 = (mid2 == 0) ? Integer.MIN_VALUE : b[mid2 - 1];

            int r1 = (mid1 == n1) ? Integer.MAX_VALUE : a[mid1];
            int r2 = (mid2 == n2) ? Integer.MAX_VALUE : b[mid2];

            if (l1 <= r2 && l2 <= r1) {
                return Math.max(l1, l2);
            } 
            else if (l1 > r2) {
                high = mid1 - 1;
            } 
            else {
                low = mid1 + 1;
            }
        }

        return -1;
    }
}
