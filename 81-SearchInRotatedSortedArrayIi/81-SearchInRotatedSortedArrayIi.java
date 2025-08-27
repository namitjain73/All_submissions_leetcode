// Last updated: 8/28/2025, 2:52:09 AM
class Solution {
    public boolean search(int[] nums, int target) {
        Arrays.sort(nums);
        return find(nums,target);
        
    }

    public static boolean find(int[] arr,int t){
        int n = arr.length;
        int lo = 0;
        int hi = n-1;
        while(lo <= hi){
            int mid = lo + (hi - lo)/2;
            if(arr[mid] == t){
                return true;
            }
            else if(arr[mid] < t){
                lo = mid + 1;
            }
            else{
                hi = mid - 1;
            }
        }
        return false;
    }
}