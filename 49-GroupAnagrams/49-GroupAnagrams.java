// Last updated: 8/28/2025, 2:52:33 AM
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();

        for(String word : strs){
            char[] ch = word.toCharArray();
            Arrays.sort(ch);
            String key = new String(ch);
            if(!map.containsKey(key)){
                map.put(key,new ArrayList<>());
            }
            map.get(key).add(word);
        }
        return new ArrayList<>(map.values());
        
    }
}