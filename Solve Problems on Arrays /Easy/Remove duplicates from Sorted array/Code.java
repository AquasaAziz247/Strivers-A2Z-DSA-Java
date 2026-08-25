//Brute Force
// TC : O(N+NLOGN)
//SC : O(N)
class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer> set = new LinkedHashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        int index = 0;

        for (int num : set) {
            nums[index++] = num;
        }
        return set.size();
    }
}

//Optimize
// TC : O(N)
//SC : O(1)


class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int i=0;
        for(int j=1;j<n;j++){
            if(nums[i]!=nums[j]){
                nums[i+1]=nums[j];
                i++;
            }
        }
        return i+1;
    }
}
