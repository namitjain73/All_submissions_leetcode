// Last updated: 8/28/2025, 2:49:01 AM
class Solution {
    public int kthGrammar(int n, int k) {
        return rec(n,k);
        
    }

    public int rec(int n, int k){
        if(n == 1 && k == 1){
            return 0;
        }

        int len  = (int)Math.pow(2,n-1);
        int mid = len/2;
        if(k <= mid){
            return rec(n-1,k);
        }
        else{
            return 1-rec(n-1 , k-mid);
        }
    }
}