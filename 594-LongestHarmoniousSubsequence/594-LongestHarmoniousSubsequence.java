// Last updated: 8/28/2025, 2:49:34 AM
class Solution {
    public int findLHS(int[] nums) {
        Arrays.sort(nums);
        Map<Integer,Integer> map = new HashMap<>();
        for(int i : nums){
            map.put(i , map.getOrDefault(i,0)+1);
        }

        int pre = nums[0];
        int max = 0;
        for(int i = 1 ; i < nums.length ; i++){
            if(nums[i] - pre == 1){
                max = Math.max(max,map.get(pre)+map.get(nums[i]));
            }
            if(pre != nums[i]){
                pre = nums[i];
            }
        }
        return max;
        
    }
}