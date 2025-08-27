// Last updated: 8/28/2025, 2:49:46 AM
class Solution {
    public boolean detectCapitalUse(String w) {
        boolean flag1 = true;
        boolean flag2 = true;
        for(int i = 0 ; i < w.length() ; i++){
            if(!(w.charAt(i) >= 64  &&   w.charAt(i) <= 90)){
                flag1 = false;
                break;
            }
        }
        for(int i = 1 ; i < w.length() ; i++){
            if(!(w.charAt(i) >= 97  &&   w.charAt(i) <= 122)){
                flag2 = false;
                break;
            }
        }

        if(flag1 || flag2){
            return true;
        }
        return false;
        
    }
}
