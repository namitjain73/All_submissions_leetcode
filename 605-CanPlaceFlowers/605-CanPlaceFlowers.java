// Last updated: 8/28/2025, 2:49:32 AM
class Solution {
    public boolean canPlaceFlowers(int[] nums, int n) {
        int c = 0;
        for(int i = 0  ; i < nums.length ; i++){
            if(nums[i] == 0){
                boolean left = (i == 0) || (nums[i-1] ==  0);
                boolean right = (i == nums.length - 1) || ( nums[i+1] == 0);
                if(left && right){
                    c++;
                    nums[i] = 1;
                    if(c >= n) return true;
                }
            }
        }
        return c >= n;
        
    }
}