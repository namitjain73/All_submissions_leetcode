// Last updated: 8/28/2025, 2:52:15 AM
class Solution {
    public void sortColors(int[] arr) {
        int r = 0;
        int w = 0;
        int b = 0;
        int n = arr.length;
        for(int  i =0; i < n ; i++){
            if(arr[i] == 0){
                r++;
            }
            else if(arr[i] == 1){
                w++;
            }
            else{
                b++;
            }
        }
        for(int  i = 0; i < n ; i++){
            if(r > 0){
                arr[i] = 0;
                r--;
            }
            else if(w > 0){
                arr[i] = 1;
                w--;
            }
            else{
                arr[i] = 2;
                b--;
            }
        }
        // return arr;
        
    }
}