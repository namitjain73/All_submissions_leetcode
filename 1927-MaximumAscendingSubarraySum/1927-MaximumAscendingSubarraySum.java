// Last updated: 8/28/2025, 2:47:33 AM
class Solution {
    public int maxAscendingSum(int[] nums) {
        return sum(nums);
        
    }
    public static int sum(int [] arr){
        int n = arr.length;
        int sum = arr[0];
        int max = arr[0];
        for(int i = 1 ; i < n ; i++){
            if(arr[i - 1] < arr[i]){
                sum += arr[i];
                max = Math.max(max,sum);
            }else{
                sum = arr[i];

            }


        }
        return max;
    }
}