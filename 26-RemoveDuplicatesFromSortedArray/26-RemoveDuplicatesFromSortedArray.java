// Last updated: 8/28/2025, 2:52:52 AM
class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums[0];
        int c = 1;
        for(int i = 1,j=1; i < nums.length ; i++){
            if(nums[i] != nums[i-1]){
                nums[j] = nums[i];
                c++;
                j++;
            }
        }
        return c;
        
    }
}