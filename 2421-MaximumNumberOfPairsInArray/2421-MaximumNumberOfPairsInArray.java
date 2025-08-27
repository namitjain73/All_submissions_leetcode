// Last updated: 8/28/2025, 2:46:52 AM
class Solution {
    public int[] numberOfPairs(int[] nums) {
        int n = 0 ;
        int x = 0;
        int[] arr = new int[101];
        for(int i : nums) arr[i]++;
        for(int i : arr){
            n += i/2;
            x += i%2;
        }
        return new int[]{n,x};
        
    }
}