// Last updated: 8/28/2025, 2:50:24 AM
class Solution {
    public boolean isPowerOfFour(int n) {
    if (n <= 0) return false;
    while (n % 4 == 0) {
        n /= 4;
    }
    return n == 1;
}

}