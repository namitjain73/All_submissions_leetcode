// Last updated: 8/28/2025, 2:48:22 AM
class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        int sum = 0;
        for(int i : arr){
            sum += i;
        }

        if(sum % 3 != 0) return false;
        int count = sum/3;

        int part = 0;
        sum =0;
        for(int i = 0 ; i < arr.length ; i++){
            sum += arr[i];
            if(sum == count){
                part++;
                sum=0;
            }
            if(part == 2 && i < arr.length-1) return true;
        }
        return false;
        
    }
}