// Last updated: 8/28/2025, 2:47:49 AM
class Solution {
    public int maxProduct(int[] nums) {
        sort(nums);
        int n = nums.length;
        return (nums[n-1]-1)*(nums[n-2]-1);
        
    }

    public static void sort(int[] arr){
        int n = arr.length;
        for(int i = 1 ;i < n ; i++) {
			 for(int j = 0 ; j < (n-i) ; j++) {
				 if(arr[j] > arr[j+1]) {
					 int temp = arr[j];
					 arr[j] = arr[j+1];
					 arr[j+1] = temp;
				 }
				 
			 }
			 
		 }
    }
}