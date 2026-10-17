
class Solution {
    public long countSubstrings(String s) {
        long ans = 0;
        int[] freq = new int[1 << 10];

        int oddMask = 0;
        freq[0] = 1;

        for (int i = 0; i < s.length(); i++) {
            int bit = s.charAt(i) - 'a';
            oddMask ^= (1 << bit);

            ans += freq[oddMask];

            for (int j = 0; j < 10; j++) {
                ans += freq[oddMask ^ (1 << j)];
            }

            freq[oddMask]++;
        }

        return ans;
    }
}
