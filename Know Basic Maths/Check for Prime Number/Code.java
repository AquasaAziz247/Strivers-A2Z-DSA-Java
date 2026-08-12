//My Version
class Solution {
    public boolean isPrime(int n) {
        for(int i=1;i<=n;i++){
            if(n%i==0){
                if(i!=1 && i!=n)
                return false;
            }
        }
        return true;
    }
}

TC : O(n)
SC : O(1)

//Optimized Version

class Solution {
    public boolean isPrime(int n) {
        if(n<2){
            return false;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}


TC : O(sqrt(n))
SC : O(1)  
