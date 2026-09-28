class Solution {
    public int findPages(int[] nums, int m) {
        int n = nums.length;

        if (m > n) {
            return -1;
        }

        int low = 0;
        int high = 0;

        for (int pages : nums) {
            low = Math.max(low, pages);
            high += pages;
        }

        while (low <= high) {
            int mid = low + (high - low) / 2;

            int students = countStudents(nums, mid);

            if (students > m) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return low;
    }

    private int countStudents(int[] nums, int pages) {
        int students = 1;
        int pagesStudent = 0;

        for (int bookPages : nums) {
            if (pagesStudent + bookPages <= pages) {
                pagesStudent += bookPages;
            } else {
                students++;
                pagesStudent = bookPages;
            }
        }

        return students;
    }
}
