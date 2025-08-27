// Last updated: 8/28/2025, 2:47:48 AM
class Solution {
    public double average(int[] salary) {
        int sum = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i : salary){
            min = Math.min(min,i);
            max = Math.max(max,i);
            sum += i;
        }

        sum -= min;
        sum -= max;
        double ans = (double)(sum) / (double)(salary.length - 2);
        // double rounded = Math.round(ans * 100000.0) / 100000.0;
        return ans;
        
    }
}