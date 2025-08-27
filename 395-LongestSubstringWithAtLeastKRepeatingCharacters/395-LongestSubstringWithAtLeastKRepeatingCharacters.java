// Last updated: 8/28/2025, 2:50:12 AM
class Solution {
    public int longestSubstring(String s, int k) {
        Map<Character , Integer> map = new HashMap<>();
        for(char ch : s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        for(int i = 0 ; i < s.length() ; i++){
            if(map.get(s.charAt(i)) < k){
                int left = longestSubstring(s.substring(0,i),k);
                int right = longestSubstring(s.substring(i+1),k);
                return Math.max(left,right);
            }
        }
        return s.length();
        
    }
}