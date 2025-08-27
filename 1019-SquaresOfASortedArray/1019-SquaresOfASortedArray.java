// Last updated: 8/28/2025, 2:48:30 AM
class Solution {
    public int[] sortedSquares(int[] nums) {
        for(int i = 0 ; i < nums.length ; i++){
            nums[i] = nums[i]*nums[i];
        }
                Arrays.sort(nums);

        return nums;
        
    }
}