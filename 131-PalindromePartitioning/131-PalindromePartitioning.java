// Last updated: 8/28/2025, 2:51:38 AM
class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ll = new ArrayList<>();
        List<String> list = new ArrayList<>();
        rec(s  , list , ll);
        return ll;
    }
    public void rec(String s, List<String> list , List<List<String>> ll){
        if(s.length() == 0){
            ll.add(new ArrayList(list));
            return;
        }

        for(int i = 1 ; i <= s.length() ; i++){
            String ans = s.substring(0,i);
            if(plindrome(ans)){
                list.add(ans);
                rec(s.substring(i),list,ll);
                list.remove(list.size()-1);
            }
        }
    }
    public static boolean  plindrome(String s) {
		int lo = 0 ;
		 int hi = s.length()-1;
		 while(lo < hi) {
			 if(s.charAt(lo) != s.charAt(hi)) {
				 return false;
			 }
			 lo++;
			 hi--;
		 }
		 return true;
	}
}