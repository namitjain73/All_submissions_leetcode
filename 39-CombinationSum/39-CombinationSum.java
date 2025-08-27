// Last updated: 8/28/2025, 2:52:42 AM
class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ll = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        Sum(candidates,target,list,ll,0);
        return ll;
    }
    public static void Sum(int[] arr ,int amount , List<Integer> list, List<List<Integer>> ll,int idx){
        if(amount == 0){
            ll.add(new ArrayList<>(list));
            return;
        }

        for(int i = idx ; i < arr.length ; i++){
            if(amount >= arr[i]){
                list.add(arr[i]);
                Sum(arr,amount - arr[i] , list , ll,i);
                list.remove(list.size()-1);
            }
        }
    }
}