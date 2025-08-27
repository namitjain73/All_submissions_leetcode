// Last updated: 8/28/2025, 2:51:05 AM
class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length - k];
        
    }
}