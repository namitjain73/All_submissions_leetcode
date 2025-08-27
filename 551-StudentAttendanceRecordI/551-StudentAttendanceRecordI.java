// Last updated: 8/28/2025, 2:49:40 AM
class Solution {
    public boolean checkRecord(String s) {
        boolean flag1 = true;
        boolean flag2 = true;

        if(s.contains("LLL")){
            flag1 = false;
        }
        int c = 0;
        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i) == 'A'){
                c++;
            }
        }

        if(c > 1){
            flag2 = false;
        }

        if(flag1 && flag2){
            return true;
        }
        return false;
        
    }
}