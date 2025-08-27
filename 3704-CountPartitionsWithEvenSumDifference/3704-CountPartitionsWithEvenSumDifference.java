// Last updated: 8/28/2025, 2:45:43 AM
class Solution {
    public static int countPartitions(int[] nums) {
        int n = 0;
        for(int i = 0; i < nums.length ; i++){
            n += nums[i];
        }
        int count = 0;
        for(int i = 0 ; i < nums.length-1 ; i++){
            n -= 2*nums[i];
            if(n % 2  == 0){
                count++;
            }
        }
        return count;
        
    }
}