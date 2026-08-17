// Strivers Approach (Recursion Based)

class Solution {
    public boolean isPalindrome(String s) {

        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        return check(0, s);
    }

    private boolean check(int i, String s) {

        if (i >= s.length() / 2) {
            return true;
        }

        if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
            return false;
        }

        return check(i + 1, s);
    }
}

TC = O(N/2)=O(N)
SC = O(N)


//My Approach (Two Pointer)

class Solution {
    public boolean isPalindrome(String s) {

        String s1 = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        char[] chars = s1.toCharArray();

        int left = 0;
        int right = chars.length - 1;

        while (left < right) {

            if (chars[left] != chars[right]) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}

TC : O(N)
SC : O(N)  
