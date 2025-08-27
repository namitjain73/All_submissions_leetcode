// Last updated: 8/28/2025, 2:48:54 AM
class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        for(int i = 0 ; i < shifts.length ; i++){
            shifts[i] = shifts[i] % 26; 
        }
        modify(shifts);
        String s1 = "";
        for(int i = 0 ; i < shifts.length ; i++){
            s1 += modifystr(s.charAt(i),shifts[i]);
        }
        return s1;
        
    }

    public static void modify(int[] arr){
        int n = arr[arr.length-1];
        for(int i = arr.length-2 ; i >= 0 ; i--){
            n += arr[i];
            arr[i] = n; 
        }
    }
    public static String modifystr(char ch , int n){
        n = n%26;
        if(ch+n > 122){
            return Character.toString(ch - 26 + n);
        }
        return Character.toString(ch + n);
    }
}