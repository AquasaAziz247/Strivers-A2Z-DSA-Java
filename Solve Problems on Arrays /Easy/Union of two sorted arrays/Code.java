//Optimal

class Solution {
    public int[] unionArray(int[] nums1, int[] nums2) {

        ArrayList<Integer> result = new ArrayList<>();

        int i = 0;
        int j = 0;

        while (i < nums1.length && j < nums2.length) {

            int value;

            if (nums1[i] < nums2[j]) {
                value = nums1[i];
                i++;
            } 
            else if (nums1[i] > nums2[j]) {
                value = nums2[j];
                j++;
            } 
            else {
                value = nums1[i];
                i++;
                j++;
            }

            // Add only if it's not a duplicate
            if (result.isEmpty() || 
                result.get(result.size() - 1) != value) {
                result.add(value);
            }
        }

        // Remaining nums1 elements
        while (i < nums1.length) {
            if (result.isEmpty() || 
                result.get(result.size() - 1) != nums1[i]) {
                result.add(nums1[i]);
            }
            i++;
        }

        // Remaining nums2 elements
        while (j < nums2.length) {
            if (result.isEmpty() || 
                result.get(result.size() - 1) != nums2[j]) {
                result.add(nums2[j]);
            }
            j++;
        }

        int[] ans = new int[result.size()];

        for (int k = 0; k < result.size(); k++) {
            ans[k] = result.get(k);
        }

        return ans;
    }
}

Time: O(n + m)
Auxiliary Space: O(1), excluding the output array/list.
Output Space: O(n + m).
