// Last updated: 8/28/2025, 2:46:55 AM
class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        int n = spells.length;
        int m = potions.length;
        for(int i = 0 ; i < spells.length ; i++){
            spells[i] = m - BS(spells[i],potions,success);

        }
        return spells;
        
    }
    public static int BS(int n , int[] potions , long success){
        int ans = 0;
        int lo = 0;
        int hi = potions.length;
        while(lo < hi){
            int mid = lo + (hi - lo)/ 2;
            long l =(1l * n) * potions[mid];
            if(l < success){
                ans = mid;
                lo = mid + 1;;
            }
            else{
                hi = mid;
            }
        }
        return lo;
    }
}