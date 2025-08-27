// Last updated: 8/28/2025, 2:47:20 AM
class Solution {
    public String reversePrefix(String s, char ch) {
        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i) == ch){
                return reverse(s,0,i);
            }
        }
        return s;
        
    }
    public static String reverse(String sb , int lo,int hi){
        StringBuilder s = new StringBuilder(sb);
         while (lo < hi) {
            char temp = s.charAt(hi);
            s.setCharAt(hi,s.charAt(lo));
            s.setCharAt(lo,temp);
            lo++;
            hi--;
        } 
        return  s.toString();
        
    }
}