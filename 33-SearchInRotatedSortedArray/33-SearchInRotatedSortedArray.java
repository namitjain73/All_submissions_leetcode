// Last updated: 8/28/2025, 2:52:48 AM
class Solution {
    public int search(int[] nums, int target) {
        return idx(nums,target);
    }
public static int idx(int [] arr,int t){
        int n = arr.length;
        int lo = 0 ;
        int hi = n -1;
        while(lo <= hi){
             int mid = lo + (hi - lo) / 2;
             if(arr[mid] == t){
                 return mid;
             }
             if(arr[lo] <= arr[mid]){
                 if(arr[lo] <= t && t <= arr[mid]){
                     hi = mid - 1;
                 }
                 else{
                     lo = mid + 1;
                 }
                 
             }
             else{
                 if(arr[mid] <= t && t <= arr[hi]){
                     lo = mid + 1;
                 }
                 else{
                     hi = mid - 1;
                 }
                 
             }
        }
        return -1;
    }
}