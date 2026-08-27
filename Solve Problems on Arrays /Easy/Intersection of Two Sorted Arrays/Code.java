//Given two sorted arrays arr1[] and arr2[]. Your task is to return the intersection of both arrays.
//Intersection of two arrays is said to be elements that are common in both arrays. The intersection should not count duplicate elements.
//Note: If there is no intersection then return an empty array. 

class Solution {
    static ArrayList<Integer> intersection(int arr1[], int arr2[]) {

        ArrayList<Integer> ans = new ArrayList<>();

        int i = 0;
        int j = 0;

        while (i < arr1.length && j < arr2.length) {

            if (arr1[i] < arr2[j]) {
                i++;
            }
            else if (arr1[i] > arr2[j]) {
                j++;
            }
            else {

                // Add only if not already added
                if (ans.isEmpty() || 
                    ans.get(ans.size() - 1) != arr1[i]) {
                    ans.add(arr1[i]);
                }

                i++;
                j++;
            }
        }

        return ans;
    }
}

Time Complexity: O(n + m)
Auxiliary Space: O(1)
Output Space: O(min(n, m))
