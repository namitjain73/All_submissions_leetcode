// Last updated: 8/28/2025, 2:50:57 AM
class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList<>();
                if(nums.length == 0) return list;

        int i = nums[0];
        for(int k = 1  ; k <= nums.length ; k++){
            if(k == nums.length  || nums[k] != nums[k-1]+1){
                if(i == nums[k-1]){
                    list.add(Integer.toString(nums[k-1]));
                }
                else{
                    list.add(i + "->" + nums[k-1]);
                }
                if(k < nums.length) i = nums[k];
            }
            
        }
        return list;
        
    }
}