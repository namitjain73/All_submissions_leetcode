// Last updated: 8/28/2025, 2:50:36 AM
class Solution {
    public boolean wordPattern(String pattern, String s) {
        Map<Character, String> mp = new HashMap<>();
        Map<String, Character> cts = new HashMap<>();
        String[] words = s.split(" ");
        
        if (pattern.length() != words.length) return false;
        
        for (int i = 0; i < pattern.length(); i++) {
            char ch = pattern.charAt(i);
            String word = words[i];

            if (mp.containsKey(ch)) {
                if (!mp.get(ch).equals(word)) return false;
            } else if (cts.containsKey(word)) {
                return false;
            }
            
            mp.put(ch, word);
            cts.put(word, ch);
        }
        return true;
    }
}
