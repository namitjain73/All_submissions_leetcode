// Last updated: 8/28/2025, 2:48:38 AM
class Solution {
    public int minAddToMakeValid(String s) {
        int count = 0;
        int open = 0;

        for(int i= 0 ; i < s.length() ; i++){
            if(s.charAt(i) == '(') open++;
            else{
                if(open == 0){
                    count++;
                }
                else{
                    open--;
                }
            }
        }

        return open + count;

    }
}