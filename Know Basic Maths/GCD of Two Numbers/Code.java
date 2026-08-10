//Optimize
class Solution {
    public int GCD(int n1, int n2) {
        while(n1>0 && n2>0){
            if(n1>n2){
                n1=n1%n2;
            }else{
                n2=n2%n1;
            }
        }
        if(n1==0) return n2;
        return n1;
    }
}

TC : O(log(min(n1,n2))
SC : O(1)

//Brute force
import java.util.*;

class Solution {
    public int GCD(int n1, int n2) {

        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();

        // Find divisors of n1
        for (int i = 1; i <= n1; i++) {
            if (n1 % i == 0) {
                s1.add(i);
            }
        }

        // Find divisors of n2
        for (int i = 1; i <= n2; i++) {
            if (n2 % i == 0) {
                s2.add(i);
            }
        }

        // Find greatest common divisor
        int gcd = 1;

        for (int num : s1) {
            if (s2.contains(num) && num > gcd) {
                gcd = num;
            }
        }

        return gcd;
    }
}

TC : O(n1 + n2)
SC : O(n1 + n2)

//Improved Brute force
  class Solution {
    public int GCD(int n1, int n2) {

        int gcd = 1;

        for (int i = 1; i <= Math.min(n1, n2); i++) {

            if (n1 % i == 0 && n2 % i == 0) {
                gcd = i;
            }
        }

        return gcd;
    }
}

Time  → O(min(n1, n2))
Space → O(1)
