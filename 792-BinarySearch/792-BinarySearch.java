// Last updated: 8/28/2025, 2:49:03 AM
class Solution {
    public int search(int[] nums, int target) {
        return binary_search(nums,target);
        
    }

    public static int binary_search(int[] arr ,int item){
        int lo = 0 ;
        int hi = arr.length-1;
        while(lo <= hi){
            int mid = (int)(lo + (hi-lo)/2);
            if(arr[mid] ==  item){
                return mid;
            }
            else if(arr[mid] > item){
                hi = mid -1;
            }
            else{
                lo = mid + 1;
            }
        }
        return -1;
    }
}