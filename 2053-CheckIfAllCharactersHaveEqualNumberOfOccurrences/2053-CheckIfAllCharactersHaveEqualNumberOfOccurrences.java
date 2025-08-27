// Last updated: 8/28/2025, 2:47:25 AM
class Solution {
    public boolean areOccurrencesEqual(String s) {
        Map<Character,Integer> map = new HashMap<>();
        for(int i = 0 ; i < s.length() ; i++){
           map.put(s.charAt(i),map.getOrDefault(s.charAt(i), 0) + 1); 
        }
        int re = map.get(s.charAt(0));
        for(int n : map.values()){
            if(n != re) return false;
        }
        return true;
    }
}