// Last updated: 8/28/2025, 2:49:53 AM
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        return max(nums);
        
    } public static int max(int[] arr){
        int max1 = 0;
        int sum = 0;
        for(int i = 0 ; i < arr.length ; i++){
            
            if(arr[i] == 1){
                sum += 1;
                max1 = Math.max(sum,max1);
            }
            else if(arr[i] == 0){
                sum = 0;
            }
        }
        return max1;
    }
}