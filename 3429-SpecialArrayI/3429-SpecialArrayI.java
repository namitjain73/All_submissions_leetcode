// Last updated: 8/28/2025, 2:45:58 AM
class Solution {
    public boolean isArraySpecial(int[] arr) {
        for(int i = 0 ; i < arr.length - 1 ; i++){
            if(!((arr[i] % 2 == 0 && arr[i+1] % 2 != 0) || (arr[i] % 2 != 0 && arr[i+1] % 2 == 0))){
                return false;
            }
        }
        return true;
        
    }
}