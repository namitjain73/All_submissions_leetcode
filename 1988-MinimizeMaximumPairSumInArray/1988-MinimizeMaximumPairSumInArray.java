// Last updated: 8/28/2025, 2:47:29 AM
class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int max = 0;
        int i = 0;
        int j = nums.length - 1;
        while(i < j){
            max = Math.max(max,(nums[i]+nums[j]));
            i++;
            j--;
        }
        return max;
        
    }
}