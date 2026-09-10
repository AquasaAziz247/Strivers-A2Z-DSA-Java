class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> ans = new ArrayList<>();

        for (int row = 1; row <= numRows; row++) {
            
            List<Integer> temp = new ArrayList<>();
            int value = 1;

            for (int col = 1; col <= row; col++) {
                temp.add(value);

                value = value * (row - col) / col;
            }

            ans.add(temp);
        }

        return ans;
    }
}


Final
Complexity	Value
Time	O(n²)
Space	O(n²)
