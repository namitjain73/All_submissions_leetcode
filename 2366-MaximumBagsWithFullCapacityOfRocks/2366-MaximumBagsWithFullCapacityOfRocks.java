// Last updated: 8/28/2025, 2:46:56 AM
class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        List<Integer> list = new ArrayList<>();
        int c = 0;
        for(int i = 0; i < rocks.length ; i++){
            if(capacity[i] - rocks[i] == 0) c++;
            else{
                list.add(capacity[i] - rocks[i]);
            }
        }

        Collections.sort(list);

        for(int i : list){
            if(additionalRocks - i >= 0){
                additionalRocks -= i;
                c++;
            }
        }
        return c;
        
    }
}