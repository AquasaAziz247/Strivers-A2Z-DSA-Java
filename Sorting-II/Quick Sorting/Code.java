//Quick Sorting

class Solution {
    public int[] quickSort(int[] nums) {
        int n = nums.length;
        int low=0;
        int high = n-1;
        quickS(nums,low,high);
        return nums;
    }
    private void quickS(int[] nums,int low,int high){
        if(low<high){
            int partitionIndex=pivotFinder(nums,low,high);
            quickS(nums,low,partitionIndex-1);
            quickS(nums,partitionIndex+1,high);
        }
    }

    private int pivotFinder(int nums[],int low, int high){
        int pivot=nums[low];
        int i=low;
        int j=high;

        while(i<j){
            while(i<=high && nums[i]<=pivot ){
                i++;
            }
            while(j>=low && nums[j]>pivot ){
                j--;
            }
            if(i<j){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }
        int temp = nums[low];
        nums[low] = nums[j];
        nums[j] = temp;
        return j;
    }
}
