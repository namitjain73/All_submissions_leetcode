// Last updated: 8/28/2025, 2:50:16 AM
class Solution {
    public boolean canConstruct(String r, String m) {
        return compair(r,m);
        
    }

    public static boolean compair(String s1 , String s2){
        int[] arr1 = cheak(s1);
        int[] arr2 = cheak(s2);
        for(int i = 0 ; i < arr1.length  ; i++){
            if(arr1[i] <= arr2[i]){
                continue;
            }
            else{
                return false;
            }
        }
        return true;
        
    }

    public static int[] cheak(String s){
        char[] ch = s.toCharArray();
        int[] arr = new int[26];
        for(int i = 0 ; i < ch.length ; i++){
            arr[ch[i] - 'a'] += 1;

        }
        return arr;
    }
}