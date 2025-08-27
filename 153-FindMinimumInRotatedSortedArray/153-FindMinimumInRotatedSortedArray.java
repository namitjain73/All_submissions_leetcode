// Last updated: 8/28/2025, 2:51:25 AM
class Solution {
    public int findMin(int[] nums) {
        int lo = 0;
        int hi = nums.length-1;
        while(lo < hi){
            int mid = lo + ( hi  - lo) / 2;
            if(nums[mid] > nums[hi]){
                lo = mid + 1;
            }
            else{
                hi = mid;
            }
        }
        return nums[lo];
    }
}