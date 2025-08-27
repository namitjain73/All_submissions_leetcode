// Last updated: 8/28/2025, 2:48:44 AM
class Solution {
    public int[] fairCandySwap(int[] a, int[] b) {
        Set<Integer> set = new HashSet<>();
        int sum1 = 0;
        int sum2 = 0;
        for(int i : a){
            sum1 += i;
            
        }
        for(int j : b){
            sum2 += j;
            set.add(j);
        }

        int diff = (sum1 - sum2) / 2;

        for(int i : a){
            if(set.contains(i-diff)){
                return new int[] {i , i - diff};
            }
        }
        return new int[]{-1,-1};
    }
}