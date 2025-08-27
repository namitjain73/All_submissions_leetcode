// Last updated: 8/28/2025, 2:48:37 AM
class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return max(nums,goal)-max(nums,goal-1);
    }
    public int max(int[] nums, int goal) {
        if(goal<0) return  0;
        int lo = 0;
        int ans = 0;
        int c =0;
        for(int hi = 0 ; hi < nums.length ;hi++){
            c += nums[hi];
            while(c > goal) c -= nums[lo++];
            ans += (hi - lo + 1);
            
        }
        return ans;
    }
}