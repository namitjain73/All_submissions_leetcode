// Last updated: 8/28/2025, 2:49:42 AM
class Solution {
    public int singleNonDuplicate(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num , map.getOrDefault(num,0)+1);
        }

        for(int i : map.keySet()){
            if(map.get(i) == 1) return i;
        }

        return -1;
        
    }
}