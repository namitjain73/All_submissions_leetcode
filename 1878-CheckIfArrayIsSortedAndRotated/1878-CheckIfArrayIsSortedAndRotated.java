// Last updated: 8/28/2025, 2:47:36 AM
class Solution {
    public boolean check(int[] nums) {
        int max = 0;
        if(nums[nums.length-1] > nums[0]) max++;
        for(int i = 1 ; i < nums.length ; i++) if(nums[i-1] > nums[i]) max++;
        return max < 2;
    }
}