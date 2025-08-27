// Last updated: 8/28/2025, 2:51:40 AM
class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        Arrays.sort(nums);
        int count = 1;
        int max = 1;

        for(int i = 1 ; i < nums.length ; i++){
            if(nums[i-1] == nums[i]) continue;
            else if(nums[i-1] == nums[i]-1) {
                count++;
                max = Math.max(max,count);
            }
            else{
                count = 1;
            }
        }
        return  max;
    }
}