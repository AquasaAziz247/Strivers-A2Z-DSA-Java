class Solution {
    public String longestPalindrome(String s) {
         int start = 0, end = 0;

        // Iterate through each character as center
        for (int center = 0; center < s.length(); center++) {
            // Expand around odd length palindrome
            int lenOdd = expandFromCenter(s, center, center);
            // Expand around even length palindrome
            int lenEven = expandFromCenter(s, center, center + 1);
            // Get the max of both lengths
            int maxLen = Math.max(lenOdd, lenEven);

            // Update the longest palindrome boundaries
            if (maxLen > end - start) {
                start = center - (maxLen - 1) / 2;
                end = center + maxLen / 2;
            }
        }

        // Return the longest palindromic substring
        return s.substring(start, end + 1);
    }

    // Helper function to expand from the center
    private int expandFromCenter(String str, int left, int right) {
        while (left >= 0 && right < str.length() && str.charAt(left) == str.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
       
    }
}
