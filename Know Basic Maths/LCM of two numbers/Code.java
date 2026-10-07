class Solution {
    public int LCM(int n1, int n2) {

        int a = n1;
        int b = n2;

        // Find GCD using Euclidean Algorithm
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        int gcd = a;

        return (n1 / gcd) * n2;
    }
}
