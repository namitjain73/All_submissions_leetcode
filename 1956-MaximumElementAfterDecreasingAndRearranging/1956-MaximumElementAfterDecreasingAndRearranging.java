// Last updated: 8/28/2025, 2:47:31 AM
class Solution {
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        Arrays.sort(arr);
        int ans = 1;
        for(int i = 1; i < arr.length ; i++){
            if(arr[i] >= ans + 1){
                ans++;
            }
        }
        return ans;
    }
}