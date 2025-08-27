// Last updated: 8/28/2025, 2:48:01 AM
class Solution {
    public boolean canConstruct(String s, int k) {
        if(s.length() == k){
            return true;
        }
        if(s.length() < k){
            return false;
        }

        int[] arr = new int[26];
        for(int i = 0 ; i < s.length() ; i++){
            arr[s.charAt(i) - 'a']=  arr[s.charAt(i) - 'a']+ 1;
        }
        int n = 0;
        for(int i = 0;i < 26 ; i++){
            if(arr[i] % 2 != 0){
                n++;
            }
        }

        if(n <= k){
            return true;
        }
        return false;

        
    }
}