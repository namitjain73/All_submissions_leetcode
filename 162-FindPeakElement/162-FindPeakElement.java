// Last updated: 8/28/2025, 2:51:22 AM
class Solution {
    public int findPeakElement(int[] nums) {
        return Print(nums);
    }

    public static int Print(int[] arr) {
		if(arr.length == 1) return 0;
		if(arr[0] > arr[1]) return 0;
		if(arr[arr.length-1] > arr[arr.length-2]) return arr.length-1;
		int lo = 1 ;
		int hi = arr.length-2;
		while(lo <= hi){
		    int mid = lo + (hi - lo)/2;
		    if(arr[mid] > arr[mid-1] && arr[mid] > arr[mid+1]){
		        return mid;
		    }
		    else if(arr[mid] < arr[mid-1]){
		        hi = mid - 1;
		    }
		    else if(arr[mid] < arr[mid+1]){
		        lo = mid + 1;
		    }
		    
		}
        return -1;
	}

}