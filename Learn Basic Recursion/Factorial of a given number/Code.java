class Solution {
    private int fact(int n){
        if(n==0){
            return 1;
        }
        return n*fact(n-1);
    }
    public int factorial(int n) {
        return(fact(n));
    }
}

TC : O(N)
SC : O(N)  
