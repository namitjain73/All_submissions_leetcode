// Last updated: 8/28/2025, 2:49:23 AM
class Solution {
    public int findLengthOfLCIS(int[] nums) {
        return MaxLength(nums);
    }

    public static int MaxLength(int[] arr){
        int sum = 1; 
        int max = 1;
        int maxe = arr[0];
        int n = arr.length;
        for(int i = 1 ; i < n ; i++){
            if(maxe < arr[i]){
                sum++;
                max = Math.max(sum,max);
                maxe = Math.max(maxe,arr[i]);
            }
            else{
                sum = 1;
                maxe = arr[i];
            }
        }
        return max;

    }
}