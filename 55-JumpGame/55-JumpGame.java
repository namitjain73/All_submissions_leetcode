// Last updated: 8/28/2025, 2:52:26 AM
class Solution {
    public boolean canJump(int[] nums) {
        int rc = 0;
        for(int i = 0 ; i < nums.length ; i++){
            if(i > rc) return false;
            rc = Math.max(i+nums[i] , rc);
        }
        return  true;
        
    }
}