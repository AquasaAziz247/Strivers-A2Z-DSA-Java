class Solution {
    public int majorityElement(int[] nums) {
        int el=0;
        int cnt=0;
        for(int i=0;i<nums.length;i++){
            if(cnt==0){
                cnt=1;
                el=nums[i];
            }else if(nums[i]==el){
                cnt++;
            }else{
                cnt--;
            }
        }
        return el;
    }
}

// Moore's Voting Algo
TC : O(N)
SC : O(1)

Sure — here is the **Java version** of the Boyer–Moore Voting Algorithm shown in the image:

```java
class Solution {
    public int majorityElement(int[] nums) {
        int cnt = 0;
        int el = 0;

        // Find the candidate
        for (int i = 0; i < nums.length; i++) {
            if (cnt == 0) {
                cnt = 1;
                el = nums[i];
            } 
            else if (nums[i] == el) {
                cnt++;
            } 
            else {
                cnt--;
            }
        }

        // Verify the candidate
        int cnt1 = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == el) {
                cnt1++;
            }
        }

        if (cnt1 > nums.length / 2) {
            return el;
        }

        return -1;
    }
}
```

### Complexity

* **Time:** `O(n)` — two passes through the array
* **Space:** `O(1)` — only `cnt`, `el`, and `cnt1`

Since the problem guarantees that a majority element **always exists**, you can actually remove the second verification loop:

```java
class Solution {
    public int majorityElement(int[] nums) {
        int cnt = 0;
        int el = 0;

        for (int num : nums) {
            if (cnt == 0) {
                el = num;
                cnt = 1;
            } else if (num == el) {
                cnt++;
            } else {
                cnt--;
            }
        }

        return el;
    }
}
```

This is **O(n) time and O(1) space**, which is the optimal solution for this problem.

  
