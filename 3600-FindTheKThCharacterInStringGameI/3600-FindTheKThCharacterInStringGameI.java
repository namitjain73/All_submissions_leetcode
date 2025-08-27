// Last updated: 8/28/2025, 2:45:52 AM
class Solution {
    public char kthCharacter(int k) {
        String bin = Integer.toBinaryString(k-1);
        int c = 0;
        for(char ch : bin.toCharArray()){
            if(ch == '1') c++;
        }

        return (char)('a'+c);
    }
}