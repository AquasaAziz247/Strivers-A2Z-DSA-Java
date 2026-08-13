class Solution {
    public void printName(int n) {
        print(1, n);
    }

    private void print(int i, int n) {
        if (i > n)
            return;

        System.out.println("John");
        print(i + 1, n);
    }
}
