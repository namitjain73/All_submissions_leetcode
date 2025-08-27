// Last updated: 8/28/2025, 2:52:19 AM
class Solution {
    public int climbStairs(int n) {
        if(n <= 1)  return 1;

        int i = 1;
        int j = 1;
        for(int k = 2 ; k <= n ; k++){
            int sum = i + j;
            i = j;
            j = sum;

        }
        return j;
    }
}
