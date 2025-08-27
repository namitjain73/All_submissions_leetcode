// Last updated: 8/28/2025, 2:52:11 AM
class Solution {
    public int removeDuplicates(int[] nums) {
        int j = 1;
        int n = nums[0];
        int c = 1;
        for(int i = 1 ; i < nums.length ; i++){
            if(n == nums[i]){
                c++;
                if(c < 3){
                    nums[j] = nums[i];
                    j++;
                }
            }
            else if(n != nums[i]){
                nums[j] = nums[i];
                j++;
                n = nums[i];
                c = 1;
            }
        }
        return j;
    }
}