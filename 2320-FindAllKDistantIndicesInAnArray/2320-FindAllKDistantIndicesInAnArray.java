// Last updated: 8/28/2025, 2:47:01 AM
class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        List<Integer> ll = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] == key) list.add(i);
        }

        // int j = 0;
        for(int i = 0 ; i< nums.length ; i++){
            for(int j : list){
                if(Math.abs(j - i) <= k){
                    ll.add(i);
                    break;
                }
            }
        }
        return ll;
    }
}