// Last updated: 8/28/2025, 2:47:39 AM
class Solution {
    public boolean closeStrings(String word1, String word2) {
        int[] arr1 = new int[26];
        int[] arr2 = new int[26];

        for(char ch : word1.toCharArray()){
            arr1[ch - 'a']++;
        }

        for(char ch : word2.toCharArray()){
            arr2[ch - 'a']++;
        }

        for(int i = 0 ; i < 26 ; i++){
            if((arr1[i] == 0 && arr2[i] != 0) || (arr1[i]!=0 && arr2[i] == 0)) return false;
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for(int i = 0 ; i < 26 ; i++){
            if(arr1[i] != arr2[i] ) return false;
        }
        return true;

    }
}