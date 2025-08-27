// Last updated: 8/28/2025, 2:49:12 AM
class Solution {
    public int dominantIndex(int[] nums) {
        int n = 0;
        int[] arr = new int[nums.length];
        int idx = -1;
        for(int i = 0 ;i < nums.length ; i++){
            n = Math.max(n,nums[i]);
            arr[i] = nums[i]*2;
        }
        Arrays.sort(arr);
        int max = arr[arr.length-2];
        for(int i = 0;i < nums.length ; i++){
            if(nums[i] == n){
                if(nums[i] >= max){
                    return i;
                }
            }
        }
        return -1;
        
    }
}