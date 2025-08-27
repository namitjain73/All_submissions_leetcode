// Last updated: 8/28/2025, 2:51:15 AM
class Solution {
    public int hammingWeight(int n) {
        String s = Integer.toBinaryString(n);
	    int c = 0;
	    for(char ch : s.toCharArray()){
	        if(ch == '1') c++;
	    }
        return c;
    }
}