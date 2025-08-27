// Last updated: 8/28/2025, 2:53:13 AM
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l = 0;
        int r = 0;

        int[] arr =new int[256];

        int max = 0;

        while(r < s.length()) {
            int ch = s.charAt(r);
            arr[ch]++;
            while(arr[ch] > 1) {
                arr[s.charAt(l)]--;
                l++;
            }
            

            max = Math.max(max, r - l+ 1);
            r++;
        }

        return max;
        
    }
}