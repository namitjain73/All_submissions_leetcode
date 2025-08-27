// Last updated: 8/28/2025, 2:45:24 AM
class Solution {
    public long maxProfit(int[] prices, int[] strategy, int k) {
        int n= prices.length;
        long x=0;
        for(int i=0;i<n;i++){
            x+=(long) prices[i]*strategy[i];
        }
        long[] pc = new long[n+1];
        long[] pp = new long[n+1];

        for(int j=0;j<n;j++){
            pp[j+1] = pp[j] + prices[j];
            pc[j+1] = pc[j] + (long) prices[j]*strategy[j];
        }
        long max=0;
        int h=k/2;
        for(int i=0;i+k<=n;i++){
            int j=k+i;
            long o1 = pc[j] - pc[i]; 
            long o2 = pp[j] - pp[i+h];
            long g = o2 - o1;
            max= Math.max(max,g);
        }

        return x + max;
    }
}