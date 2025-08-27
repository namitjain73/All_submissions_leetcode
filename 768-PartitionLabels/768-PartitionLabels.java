// Last updated: 8/28/2025, 2:49:11 AM
class Solution {
    public List<Integer> partitionLabels(String s) {
        int[] arr = new int[26];
        List<Integer> res = new ArrayList<>();
        for(int i = 0 ; i < s.length() ; i++){
            arr[s.charAt(i) - 'a'] = i;
        }
        int end = 0;
        int start = 0;
        for(int i = 0 ; i < s.length() ; i++){
            end = Math.max(end, arr[s.charAt(i)-'a'] );
            if(i == end){
                res.add(end - start + 1);
                start = i+1;
            }
        }
        return res;
        
    }
}