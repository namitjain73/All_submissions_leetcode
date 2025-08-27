// Last updated: 8/28/2025, 2:47:57 AM
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extra) {
        List<Boolean> list = new ArrayList<>();
        int max  = Integer.MIN_VALUE;
        for(int i = 0 ; i < candies.length ; i++){
            max = Math.max(max,candies[i]);
        }

        for(int i = 0 ; i < candies.length ; i++){
            if(candies[i] + extra >= max){
                list.add(true);
            }
            else{
                list.add(false);
            }
        }

        return list;        
    }
}