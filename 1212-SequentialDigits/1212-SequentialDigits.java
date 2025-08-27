// Last updated: 8/28/2025, 2:48:13 AM
class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> ll = new ArrayList<>();

        for(int i = 1 ; i <= 9 ; i++){
            int num = i;
            int nextnum = i+1;
            while(num <= high && nextnum <= 9){
                num = num * 10 + nextnum;
                if(low <= num && num <= high){
                    ll.add(num);
                }
                nextnum++;
                
            }
        }
        ll.sort(null);;
        return ll;
        
    }
}