// Last updated: 8/28/2025, 2:46:43 AM
class Solution {
    public int matchPlayersAndTrainers(int[] p, int[] t) {
        Arrays.sort(p);
        Arrays.sort(t);
        int res = 0;

        int j = 0;
        int i = 0;
        while(i < p.length && j < t.length){
            if(p[i] <= t[j]){
                i++;
                j++;
                res++;
            }else{
                j++;
            }
        }
        return res;
    }
}