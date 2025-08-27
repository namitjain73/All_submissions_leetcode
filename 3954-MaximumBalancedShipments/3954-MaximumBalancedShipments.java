// Last updated: 8/28/2025, 2:45:25 AM
class Solution {
    public int maxBalancedShipments(int[] weight) {
        int count = 0;
        int max = 0;
        int n = weight.length;
        for(int i = 0 ; i< n ; i++){
            max = Math.max(weight[i] , max);
            if(max > weight[i]){
                max = 0;
                count++;
            }
        }
        

        return count;
    }
}
