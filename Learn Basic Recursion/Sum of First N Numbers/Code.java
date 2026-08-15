class Solution {
    public int NnumbersSum(int N) {
        //your code goes here
        return printSum(1,N);
    }
        private int printSum(int i, int n){
            if(i>n){
            return 0;
            }
            return i + printSum(i+1,n);
        }
        
}
TC : O(N)
SC : O(N)  
