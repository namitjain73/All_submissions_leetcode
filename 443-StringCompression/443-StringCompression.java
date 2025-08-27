// Last updated: 8/28/2025, 2:49:59 AM
class Solution {
    public int compress(char[] chars) {
        int idx = 0;
        int i =  0;
        int n = chars.length;
    

        while(i< n){
            int count = 0;
            char currch = chars[i];
            while(i < n && currch == chars[i]){
                i++;
                count++;
            }

            chars[idx] = currch;
            idx++;
            if(count > 1){
                for(char ch : Integer.toString(count).toCharArray()){
                    chars[idx] = ch;
                    idx++;
                }
            }
            count = 0;
       }
       return idx;
    }
}