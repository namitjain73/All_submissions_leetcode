// Last updated: 8/28/2025, 2:47:46 AM
class Solution {
    public boolean isPathCrossing(String path) {
        Set set = new HashSet();
        set.add("0,0");
        int n = 0;
        int m = 0;
        for(int i = 0 ; i < path.length() ; i++){
            if(path.charAt(i) == 'N'){
                n += 1;
            }
            else if(path.charAt(i) == 'E'){
                m += 1;
            }
            else if(path.charAt(i) == 'S'){
                n -= 1;
            }
            else if(path.charAt(i) == 'W'){
                m -= 1;
            }
            if(set.contains(m + "," + n)) return true;
            set.add(m +"," + n);
        }
        return false;


        
    }
}