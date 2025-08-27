// Last updated: 8/28/2025, 2:47:27 AM
class Solution {
    public boolean makeEqual(String[] words) {
        Map<Character , Integer> mp = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
        for (int j = 0; j < words[i].length(); j++) { 
            char c = words[i].charAt(j);
            mp.put(c, mp.getOrDefault(c, 0) + 1);
        }
    }

        int n = words.length;
    for (int count : mp.values()) {
        if (count % n != 0) return false;
    }

    return true;

    }
}