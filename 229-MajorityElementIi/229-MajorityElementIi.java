// Last updated: 8/28/2025, 2:50:56 AM
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Arrays.sort(nums);
        Set list = new HashSet();
        int c =0;
        for(int i =  0; i < nums.length ; i++){
            c = 0;
            for(int j = i ; j < nums.length ; j++){
                if(nums[i] == nums[j]){
                    c++;
                }
                
            }
            if(c > nums.length/3){
                    list.add(nums[i]);
                }
        }
        return new ArrayList<>(list);
        
    }


}