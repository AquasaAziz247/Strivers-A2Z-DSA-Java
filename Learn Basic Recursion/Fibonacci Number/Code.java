class Solution {
    private int fibo(int n){
        if(n==0)
        return 0;

        if(n==1)
        return 1;

        return fib(n-1)+fib(n-2);
    }
    public int fib(int n) {
        return fibo(n);
    }
}

TC : 0(2^N) 2^N Recursion calls
SC : O(N) N Functions calls  
