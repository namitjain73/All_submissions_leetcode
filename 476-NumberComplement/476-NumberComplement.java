// Last updated: 8/28/2025, 2:49:54 AM
class Solution {
    public int findComplement(int num) {
        int m = num;
        int mask = 0;
        while(m != 0){
            m=m >> 1;
            mask = mask << 1;
            mask = mask | 1;
        }
        int ans = (~num) & mask;
        return ans;

    }
}