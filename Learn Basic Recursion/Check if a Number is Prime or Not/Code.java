
class Solution {
    public boolean checkPrime(int num) {
        if (num <= 1) {
            return false;
        }

        return isPrime(num, 2);
    }

    public boolean isPrime(int num, int divisor) {
        // Base case
        if (divisor > num / divisor) {
            return true;
        }

        // If divisible, it's not prime
        if (num % divisor == 0) {
            return false;
        }

        // Recursive call
        return isPrime(num, divisor + 1);
    }
}
