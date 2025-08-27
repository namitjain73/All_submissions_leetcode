// Last updated: 8/28/2025, 2:48:56 AM
class Solution {
    public int longestMountain(int[] arr) {
        int ans = 0;
        int i = 1;
        while(i < arr.length-1){
            if(arr[i] > arr[i - 1] && arr[i] > arr[i + 1]){
                int left = i;
                int right = i;
                while(left > 0 && arr[left] > arr[left-1]){
                    left--;
                }

                while(right < arr.length - 1 &&  arr[right] > arr[right + 1]){
                    right++;
                }

                ans = Math.max(ans , right - left + 1);
                i = right;
            }else i++;
        }
        return ans;
    }
}