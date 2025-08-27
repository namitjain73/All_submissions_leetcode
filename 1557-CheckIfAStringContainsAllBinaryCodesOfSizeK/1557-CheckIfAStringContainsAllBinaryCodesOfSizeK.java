// Last updated: 8/28/2025, 2:47:53 AM
class Solution {
    public boolean hasAllCodes(String s, int k) {
        Set<String> set= new HashSet<>();
        int t = 1 << k;
        for(int i= 0  ; i < s.length()-k+1 ; i++){
            set.add(s.substring(i,i+k));
            if(set.size() == t) return true;
        }
        return false;
    }
}