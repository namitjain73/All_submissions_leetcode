// Last updated: 8/28/2025, 2:50:45 AM
class Solution {
    public boolean isAnagram(String s, String t) {
        char[] ch = s.toCharArray();
        char[] ch1 = t.toCharArray();
        int[] arr1 = new int[26];
        int[] arr2 = new int[26];
        int n = ch.length;
        int m = ch1.length;
        if(n != m){
            return false;
        }
        for(int i =  0 ;i < n ; i ++){
            arr1[ch[i] - 'a']++;
            arr2[ch1[i] - 'a']++;
        }
        for(int i = 0 ; i < 26 ; i++){
            if(arr1[i] != arr2[i]){
                return false;
            }
        }
        return true;
    }
}