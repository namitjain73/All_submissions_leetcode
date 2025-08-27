// Last updated: 8/28/2025, 2:47:22 AM
class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int max = 0;
        for(int i = 1 ; i <= nums[nums.length-1] ; i++){
            if(nums[0] % i == 0 && nums[nums.length-1] % i == 0){
                max = Math.max(max,i);
            }
        }
        return max;
        
    }
}