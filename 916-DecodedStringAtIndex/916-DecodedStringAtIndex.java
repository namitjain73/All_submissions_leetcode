// Last updated: 8/28/2025, 2:48:47 AM
class Solution {
    public String decodeAtIndex(String s, int k) {
        long size=0;

        for(int i = 0 ; i < s.length() ; i++){
            if(Character.isLetter(s.charAt(i))){
                size += 1;
            }
            else{
                size = size * (s.charAt(i) - '0');
            }
        }

        for(int i =s.length()-1 ; i >= 0 ; i--){
            k = (int)(k % size);
            if(k == 0 && Character.isLetter(s.charAt(i))){
                return Character.toString(s.charAt(i));
            }
            if(Character.isLetter(s.charAt(i))){
                size --;
            }
            else{
                size = size / (s.charAt(i) - '0');
            }
        }
        return "";
    }
}