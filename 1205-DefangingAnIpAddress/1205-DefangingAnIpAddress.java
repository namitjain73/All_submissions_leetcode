// Last updated: 8/28/2025, 2:48:14 AM
class Solution {
    public String defangIPaddr(String address) {
        return str(address);
    }
    public static String str(String s)
    {
        String s1 = "";
        for(int i = 0 ; i < s.length() ;i++){
            if(s.charAt(i) == '.'){
                s1+="[.]";
            }
            else{
                s1+=Character.toString(s.charAt(i));
            }
        }
        return s1;
    }
}