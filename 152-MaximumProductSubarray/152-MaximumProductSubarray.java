// Last updated: 8/28/2025, 2:51:26 AM
class Solution {
    public int maxProduct(int[] nums) {
        int max = nums[0];
        int ans = 1;
        for(int i = 0 ; i < nums.length ; i ++){
            ans = 1;
            for(int j = i ; j < nums.length ; j++){
                ans *= nums[j];
                max = Math.max(ans,max);
            }
        }
        return max;
        
    }
}