// Last updated: 8/28/2025, 2:48:43 AM
class Solution {
    public int subarrayBitwiseORs(int[] arr) {
        Set<Integer> res = new HashSet<>();
        Set<Integer> curr = new HashSet<>();

        for(int num : arr){
            Set<Integer> next = new HashSet<>();
            next.add(num);
            for(int x: curr){
                next.add(x | num);
            }

            res.addAll(next);
            curr = next;
            

        }
        return res.size();
    }
}