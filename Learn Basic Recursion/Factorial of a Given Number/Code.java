class Solution {
    private long fact(int n) {
        if(n==0){
            return 1;
        }
        return n*factorial(n-1);
    }
    public long factorial(int n) {
        //your code goes here
        return(fact(n));
    }
}
