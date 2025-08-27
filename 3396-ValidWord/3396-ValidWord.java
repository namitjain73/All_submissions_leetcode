// Last updated: 8/28/2025, 2:46:02 AM
class Solution {
    public boolean isValid(String word) {
        boolean vowel = false;
        boolean consonent = false;
        if (word.length() < 3) return false;
        Set<Character> set = new HashSet<>(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));

        for(char ch : word.toCharArray()){
            if(Character.isLetter(ch)){
                if(set.contains(ch)) vowel = true;
                else consonent = true;
            }
            else if(Character.isDigit(ch)) ;
            else return false;
        }

        return (vowel && consonent);

        
    }
}