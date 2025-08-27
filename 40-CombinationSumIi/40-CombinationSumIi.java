// Last updated: 8/28/2025, 2:52:41 AM
class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ll = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        Arrays.sort(candidates);
        Print(candidates,target,list,ll,0);
        return ll;
    }
    public static void Print(int[] arr , int amount , List<Integer> list, List<List<Integer>> ll ,int idx){
        if(amount == 0){
            ll.add(new ArrayList<>(list));
            return;
        }

        for(int i = idx ; i < arr.length ; i++){
            if(i > idx && arr[i-1] == arr[i]) continue;
            if(amount >= arr[i]){
                list.add(arr[i]);
                Print(arr,amount-arr[i] , list , ll , i+1);
                list.remove(list.size()-1);
            }
        }
        return;
    }
    

}