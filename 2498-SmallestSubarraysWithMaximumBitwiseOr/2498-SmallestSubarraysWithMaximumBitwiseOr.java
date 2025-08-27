// Last updated: 8/28/2025, 2:46:42 AM
class Solution {
    List<Integer> list = new ArrayList<>();
    public int[] smallestSubarrays(int[] nums) {
        int n = nums.length;
        int[] arr = new int[nums.length];
        for(int i = 0 ; i < n ; i++){
            arr[i] = 1;
            int x = nums[i];
            for(int j = i - 1 ; j >= 0 && (nums[j] | x) != nums[j] ; j--){
                nums[j] |= x;
                arr[j] = i - j + 1;
            }
        }
        return arr;
    }

}