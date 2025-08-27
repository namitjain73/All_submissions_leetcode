// Last updated: 8/28/2025, 2:47:32 AM
class Solution {
    public int findTheWinner(int n, int k) {
        int idx = 0;
        k--;
        List<Integer> people = new ArrayList<>();
        for(int i = 1 ; i <= n ;  i++){
            people.add(i);
        }
        return winner(people, k , idx);
    }
    public int winner(List<Integer> people , int k , int idx){
        if(people.size() == 1) return people.get(0);

        idx = (idx + k) % people.size();
        people.remove(idx);
        
        return winner(people,k,idx);
    }
}