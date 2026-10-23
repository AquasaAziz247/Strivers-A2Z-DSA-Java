
class Solution {
    public int addDigits(int num) {
        if (num < 10) {
            return num;
        }

        int sum = sumOfDigits(num);
        return addDigits(sum);
    }

    private int sumOfDigits(int num) {
        if (num == 0) {
            return 0;
        }

        return (num % 10) + sumOfDigits(num / 10);
    }
}
