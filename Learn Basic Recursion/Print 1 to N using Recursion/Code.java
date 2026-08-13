class Solution {
    public void printNumbers(int n) {
        print(1,n);
    }
        private void print(int i, int n){
            if(i>n)
            return;

            System.out.print(i);
            print(i+1,n);
        }
    }
}
TC : O(N)
SC : O(N)  
