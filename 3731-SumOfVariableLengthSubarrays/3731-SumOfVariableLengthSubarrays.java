// Last updated: 8/28/2025, 2:45:42 AM
class Solution {
    public int subarraySum(int[] nums) {
        int result = 0;
        for(int i = 0 ;i < nums.length ;i++){
            int start = Math.max(0,i-nums[i]);
            for(int j = start ; j<= i ;j++){
                result += nums[j];
            }
        }
        return result;
        
    }
}