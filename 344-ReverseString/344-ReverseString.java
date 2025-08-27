// Last updated: 8/28/2025, 2:50:23 AM
class Solution {
    public void reverseString(char[] s) {
        int i = 0;
        int j = s.length - 1;
        while(i < j){
            char ch = s[i];
            s[i] = s[j];
            s[j] = ch;
            i++;
            j--;
        }
        
    }
}