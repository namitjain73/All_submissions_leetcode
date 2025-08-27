// Last updated: 8/28/2025, 2:48:06 AM
class Solution {
    public int findNumbers(int[] nums) {
        int c = 0;
        String[] arr = new String[nums.length];
        for(int i = 0 ;i < nums.length ; i++){
            if((Integer.toString(nums[i])).length() % 2 == 0){
                c++;
            }
        }
        return c;
        
    }
}