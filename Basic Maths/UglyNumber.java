class Solution {
    public boolean isUgly(int n) {
        if (n <= 0) {
            return false;
        }
        while (n % 2 == 0) {
            n /= 2;
        }
        while (n % 3 == 0) {
            n /= 3;
        }

        while (n % 5 == 0) {
            n /= 5;
        }
        return n == 1;
    }
}
// n ugly number is a positive number whose prime factors are limited to 2, 3, and 5.
// 12 = 2 × 2 × 3 here these 2 2 3 are the prime factors
