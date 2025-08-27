// Last updated: 8/28/2025, 2:51:17 AM
class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        Set seen = new HashSet() , ans = new HashSet();
        for(int i = 0 ; i + 9 < s.length() ; i++){
            String s1 = s.substring(i,i+10);
            if(!seen.add(s1)){
                ans.add(s1);
            }
        }
        return new ArrayList(ans);
        
    }
}