// Last updated: 8/28/2025, 2:50:00 AM
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        Set set = new HashSet();
        // List<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums[0];
        for(int i = 1 ; i < nums.length ; i++){
            if(n == nums[i]){
                set.add(nums[i]);
            }
            else{
                n = nums[i];
            }
        }
        return new ArrayList<Integer>(set);
        
    }
}