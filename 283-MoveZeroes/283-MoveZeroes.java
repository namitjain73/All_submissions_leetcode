// Last updated: 8/28/2025, 2:50:38 AM
class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        // if (n == 1) return;
        int j = 0;
        for(int i = 0; i < nums.length ;i++){
            if(nums[i] != 0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }

    }
}