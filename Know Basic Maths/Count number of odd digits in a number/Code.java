class Solution {
    public int countOddDigit(int n) {
        int x=n;
        int cnt=0;
        while(x!=0){
            int digit=x%10;
            if(digit%2 != 0){
                cnt++;
            }
            x=x/10;
        }
        return cnt;
    }
}
