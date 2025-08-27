// Last updated: 8/28/2025, 2:46:35 AM
class Solution {
    public boolean isCircularSentence(String sentence) {

        String [] arr = sentence.split(" ");;
        if(arr[0].charAt(0) != arr[arr.length-1].charAt(arr[arr.length-1].length()-1)){
            return false;
        }
        if(arr.length ==1){
            return arr[0].charAt(0) == arr[0].charAt(sentence.length()-1);
        }
        for(int i= 1 ; i < arr.length; i++){
            if(arr[i-1].charAt(arr[i-1].length()-1) != arr[i].charAt(0)){
                return false;
            }
        }
        return true;
        
    }
}