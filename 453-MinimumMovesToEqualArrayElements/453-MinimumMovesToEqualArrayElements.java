// Last updated: 8/28/2025, 2:49:56 AM
class Solution {
    public int minMoves(int[] nums) {
        int n = 0;
        Arrays.sort(nums);
        for(int i = 0 ; i < nums.length ; i++){
            n += nums[i] - nums[0];
        }
        return n;
        
    }
}