// Last updated: 8/28/2025, 2:47:15 AM
class Solution {
    public List<Integer> goodDaysToRobBank(int[] arr, int time) {
        List<Integer> list = new ArrayList<>();
        int n = arr.length;
        int[] nonincreasing = new int[n];
        int[] nondecreasing = new int[n]; 

        for(int i = 1; i < n - time; i++){
            if(arr[i - 1] < arr[i]) nonincreasing[i] = 0;
            else{
                nonincreasing[i] = nonincreasing[i - 1] + 1;
            }
        }

        for(int i = n-2; i >= time; i--){
            if(arr[i + 1] < arr[i]) nondecreasing[i] = 0;
            else{
                nondecreasing[i] = nondecreasing[i + 1] + 1;
            }
        }

        for(int i = time ; i < n-time ; i++){
            if(nondecreasing[i] >= time && nonincreasing[i] >= time) list.add(i);
        }
        return list;

    }
}