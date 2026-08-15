class Solution {
    public void printNumbers(int n) {
        // Your code goes here
        print(n);
    }
        private void print(int i){
            if(i==0)
            return;
            System.out.println(i);
            print(i-1);
        }
}


TC : O(N)
SC : O(N)  
