// Last updated: 8/28/2025, 2:46:08 AM
class Solution {
    public int maxFrequencyElements(int[] nums) {
        int[] arr  =new int[101];
        int max = 0;
        for(int i : nums) {
            arr[i]++;
            max = Math.max(max,arr[i]);
        }
        int ans = 0;
        for(int i : arr){
            if(i == max){
                ans += i;
            }
        }
        return ans;


        
    }
}