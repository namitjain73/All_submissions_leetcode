// Last updated: 8/28/2025, 2:49:27 AM
class Solution {
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs, (a, b) -> Integer.compare(a[0], b[0]));

        // Arrays.sort(pairs);
        int n = pairs.length;
        int arr[] = new int[n];
        int max = 1;

        for(int i = 0 ; i < n ; i++){
            arr[i] =1;
            for(int j = 0 ; j < i ; j++){
                if(pairs[j][1] < pairs[i][0]){
                    arr[i] = Math.max(arr[i],arr[j]+1);
                    max = Math.max(max,arr[i]);
                }
            }
        }
        return max;
    }
}