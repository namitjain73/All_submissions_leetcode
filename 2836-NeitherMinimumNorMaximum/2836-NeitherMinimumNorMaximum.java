// Last updated: 8/28/2025, 2:46:20 AM
class Solution {
    public int findNonMinOrMax(int[] nums) {
        Arrays.sort(nums);
        if(nums.length < 3){
            return -1;
        }
        return nums[nums.length/2];
        
    }
}