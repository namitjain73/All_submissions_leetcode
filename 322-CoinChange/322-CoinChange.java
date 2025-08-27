// Last updated: 8/28/2025, 2:50:29 AM
class Solution {
    public int coinChange(int[] coins, int amount) {
        return solve(coins,amount);
    }
    public int solve(int[] coin , int x){
        int[] dp = new int[x+1];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0] = 0;

        int min = Integer.MAX_VALUE;


        for(int i = 1 ; i <= x ; i++){
            for(int j = 0 ; j < coin.length ; j++){
                if(i - coin[j] >= 0 && dp[i-coin[j]] != Integer.MAX_VALUE){
                    dp[i] = Math.min(dp[i] , 1+dp[i-coin[j]]);
                }
            }
        }

        if(dp[x] == Integer.MAX_VALUE) return -1;
        return dp[x];
    }
}