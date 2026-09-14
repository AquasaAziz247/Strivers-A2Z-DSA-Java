import java.util.*;

public class Solution {

    public static long numberOfInversions(int[] a, int n) {
        return mergeSort(a, 0, n - 1);
    }

    private static long mergeSort(int[] a, int low, int high) {
        if (low >= high) {
            return 0;
        }

        int mid = low + (high - low) / 2;

        long count = 0;

        count += mergeSort(a, low, mid);
        count += mergeSort(a, mid + 1, high);
        count += merge(a, low, mid, high);

        return count;
    }

    private static long merge(int[] a, int low, int mid, int high) {
        int left = low;
        int right = mid + 1;

        long count = 0;

        ArrayList<Integer> temp = new ArrayList<>();

        while (left <= mid && right <= high) {

            if (a[left] <= a[right]) {
                temp.add(a[left]);
                left++;
            } else {
                temp.add(a[right]);

                // All remaining elements in the left half
                // form an inversion with a[right].
                count += (mid - left + 1);

                right++;
            }
        }

        while (left <= mid) {
            temp.add(a[left]);
            left++;
        }

        while (right <= high) {
            temp.add(a[right]);
            right++;
        }

        for (int i = low; i <= high; i++) {
            a[i] = temp.get(i - low);
        }

        return count;
    }
}


Complexity
	Complexity
Time	O(N log N)
Extra Space	O(N)
