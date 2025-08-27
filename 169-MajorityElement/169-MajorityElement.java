// Last updated: 8/28/2025, 2:51:20 AM
class Solution {
    public int majorityElement(int[] nums) {
        return moore_voting(nums);
    }

    public static int moore_voting(int[] arr){
        int e = arr[0];
        int v = 1;
        int n = arr.length;
        for(int i = 1 ; i < n ; i++){
            if(arr[i] == e){
                v++;
            }
            else{
                v--;
                if(v == 0){
                    e = arr[i];
                    v = 1;
                }
            }
        }
        return e;
    }
}