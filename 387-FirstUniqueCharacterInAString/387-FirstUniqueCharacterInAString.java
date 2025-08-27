// Last updated: 8/28/2025, 2:50:14 AM
class Solution {
    public int firstUniqChar(String s) {
        int n = s.length();
        char[] ch = s.toCharArray();
        int[] arr = new int[26];
        for(int  i = 0 ; i < n ; i++){
            arr[ch[i] - 'a'] += 1;
        }

        for(int  i = 0 ; i < n ; i++){
            if(arr[ch[i] - 'a'] == 1){
                return i;
            }
        }
        return -1;
        
    }
}