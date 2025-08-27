// Last updated: 8/28/2025, 2:50:09 AM
class Solution {
    public int longestPalindrome(String s) {
        Set<Character> set = new HashSet();
        int ans = 0;
        for(int i = 0;  i< s.length() ; i++){
            if(set.contains(s.charAt(i))){
                ans += 2;
                set.remove(s.charAt(i));
            }
            else{
                set.add(s.charAt(i));
            }

        }
        if(set.size() != 0){
            ans ++;
        }
        return ans;
    }
}