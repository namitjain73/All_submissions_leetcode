// Last updated: 8/28/2025, 2:50:34 AM
class Solution {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int[] arr= new int[n];
        int max = 1;
        Arrays.fill(arr,1);

        for(int i = 0 ; i < n ; i++){
            for(int j=0;j<=i;j++){
                if(nums[i]>nums[j]){
                    arr[i]=Math.max(arr[i],arr[j]+1);
                    max = Math.max(max,arr[i]);
                }
            }
        }
        return max;
    }
}