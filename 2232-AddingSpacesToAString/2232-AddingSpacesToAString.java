// Last updated: 8/28/2025, 2:47:10 AM
class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int n = spaces.length;
        for(int j : spaces){
            sb.append(s.substring(i,j) + " ");
            i = j;
        }
        sb.append(s.substring(i,s.length()));
        return sb.toString();
        
    }
}