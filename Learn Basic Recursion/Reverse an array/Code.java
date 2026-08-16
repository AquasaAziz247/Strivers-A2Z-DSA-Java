// One Variable 
class Solution {
    private void swap(int[] arr,int i , int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j] = temp;
    }
    private void rev(int i, int n, int[] arr){
        if(i>=n/2){
            return;
        }
        swap(arr,i,n-1-i);
        rev(i+1,n,arr);
    }
    public void reverse(int[] arr, int n) {
        rev(0,n,arr);
    }
}

TC : O(N)
SC : 0(N)

// Two Variable

class Solution {

    private void reverse(int[] arr, int left, int right) {
        // Base case
        if (left >= right) {
            return;
        }

        // Swap
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;

        // Move both pointers
        reverse(arr, left + 1, right - 1);
    }

    public void reverse(int[] arr, int n) {
        reverse(arr, 0, n - 1);
    }
}

TC : O(N)
SC : O(N)  
