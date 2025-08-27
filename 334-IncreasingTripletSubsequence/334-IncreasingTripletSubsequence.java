// Last updated: 8/28/2025, 2:50:26 AM
class Solution {
    public boolean increasingTriplet(int[] nums) {
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        for(int n : nums){
            if(n <= first) first = n;
            else if(n <= second) second = n;
            else return true;
        }
        return false;
        
    }
}