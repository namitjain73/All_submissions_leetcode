// Last updated: 8/28/2025, 2:52:47 AM
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] arr ={-1,-1};
        int left = bs(nums,target,false);
        int right = bs(nums,target,true);
        arr[0] = left;
        arr[1] = right; 
        return arr;
        
    }

    public static int bs(int[] nums , int target , boolean flag){
        int lo  =0;
        int hi = nums.length-1;
        int ans= -1;
        while(lo <= hi){
            int mid = lo + ( hi - lo);
            if(nums[mid] == target){
                ans = mid;
                if(flag){
                    lo = mid + 1;
                }
                else{
                    hi = mid - 1;
                }
            }else if(nums[mid] > target){
                hi  = mid - 1;
            }
            else{
                lo  = mid + 1;
            }
        }
        return ans;
    }
}