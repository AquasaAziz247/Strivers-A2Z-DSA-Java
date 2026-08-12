//My Version
class Solution {
    public boolean isArmstrong(int n) {

        ArrayList<Integer> arr = new ArrayList<>();

        int x = n;

        while (x != 0) {
            int digit = x % 10;
            arr.add(digit);
            x = x / 10;
        }

        int n1 = arr.size();

        int sum = 0;

        for (int i = 0; i < n1; i++) {
            sum += (int) Math.pow(arr.get(i), n1);
        }

        if (sum == n) {
            return true;
        } else {
            return false;
        }
    }
}

TC = O(logN)
SC = O(N)



//Optimized Code

class Solution {
    public boolean isArmstrong(int n) {
        int x=n;
        int digits=0;
        while(x!=0){
            digits++;
            x=x/10;
        }

        x=n;
        int sum =0;
        while(x!=0){
            int digit = x%10;
            sum +=(int)Math.pow(digit,digits);
            x=x/10;
        }
        return sum==n;
    }
}


TC = O(logN)
SC = O(1)
