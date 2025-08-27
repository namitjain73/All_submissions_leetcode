// Last updated: 8/28/2025, 2:49:39 AM
class Solution {
    public int subarraySum(int[] nums, int k) {
       Map<Integer , Integer> map = new HashMap<>();
       map.put(0,1);
       int c= 0;

        int sum = 0;

        for(int i : nums){
            sum += i;

            if(map.containsKey( sum - k )){
                c += map.get( sum - k );
            }

            map.put( sum , map.getOrDefault(sum , 0) + 1);
        }
        return c;
    }
}