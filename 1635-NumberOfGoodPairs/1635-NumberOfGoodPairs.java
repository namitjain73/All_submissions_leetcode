// Last updated: 8/28/2025, 2:47:43 AM
class Solution {
    public int numIdenticalPairs(int[] nums) {
        int n = 0;
        for(int i = 0; i < nums.length ; i++){
            for(int j = i+1; j < nums.length ; j++){
                if(nums[i] == nums[j]){
                    n++;
                }
            }
        }
        return n;
        
    }
}