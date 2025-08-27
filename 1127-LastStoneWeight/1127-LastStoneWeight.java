// Last updated: 8/28/2025, 2:48:20 AM
class Solution {
    public int lastStoneWeight(int[] stones) {
        if(stones.length == 1) return stones[0];
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0 ; i < stones.length ; i++){
            pq.add(stones[i]);
        }

        while(pq.size() > 1){
            int y = pq.remove();
            int x = pq.remove();
            // if()
            if(x < y){
                pq.add(y - x);
            }

        }
        return (pq.isEmpty() ? 0 : pq.remove());

                
    }
}