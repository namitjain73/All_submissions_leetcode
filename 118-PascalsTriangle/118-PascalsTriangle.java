// Last updated: 8/28/2025, 2:51:43 AM
class Solution {
    public List<List<Integer>> generate(int n) {
        List<List<Integer>> ll = new ArrayList<>();


        for(int i = 0 ; i < n ; i++){
            ll.add(new ArrayList<>());
            ll.get(i).add(1);
            for(int j = 1 ; j < i; j++){
                int x = ll.get(i-1).get(j-1) + ll.get(i - 1).get(j);
                ll.get(i).add(x);
            }
            if(i != 0) ll.get(i).add(1);
        }
        return ll;
    }
}