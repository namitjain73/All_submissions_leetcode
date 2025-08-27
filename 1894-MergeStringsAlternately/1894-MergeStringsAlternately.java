// Last updated: 8/28/2025, 2:47:34 AM
class Solution {
    public String mergeAlternately(String word1, String word2) {
        String s = "";
        int i = 0;
        for(;  i < Math.min(word1.length(),word2.length()) ; i++){
            s += Character.toString(word1.charAt(i)) + Character.toString(word2.charAt(i));

        }
        if(word1.length() > word2.length()){
            for(;i < word1.length() ; i++){
                s+= Character.toString(word1.charAt(i));
            }
        }
        else{
            for(;i < word2.length() ; i++){
                s+= Character.toString(word2.charAt(i));
            }
        }
        return s;
        
    }
}