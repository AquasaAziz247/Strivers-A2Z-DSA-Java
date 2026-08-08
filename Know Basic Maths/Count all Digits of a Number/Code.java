//My Approach
class Solution {
    public int countDigit(int n) {
        int count=0;
        while(n!=0){
            int digit = n%10;
            n=n/10;
            if(digit>=0){
                count++;
            }
        }
        return count;
    }

//Strivers Approach
class Solution {
    public int countDigit(int n) {
        int count=0;
      if(n==0){
        return 1;
      }
        while(n!=0){
            n=n/10;
                count++;
        }
        return count;
    }

//Optimize
    class Solution {
    public int countDigit(int n) {
        int count = (int)(Math.log10(n)+1);
        return count;
    }
}

    TC = O(1)
    SC = O(1)
