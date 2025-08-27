// Last updated: 8/28/2025, 2:45:54 AM
class Solution {
    public boolean reportSpam(String[] message, String[] bannedWords) {
        Set set = new HashSet();
        for(String str : bannedWords){
            set.add(str);
        }
        int n =0 ;

        for(String  str : message){
            if(set.contains(str)){
                n++;
            }
        }
        if(n >= 2) return true;
        return false;
        
    }
}