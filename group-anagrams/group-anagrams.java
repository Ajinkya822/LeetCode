class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String, List<String>> map=new HashMap<>();
        
        for(String word:strs){
            int [] charFrequency=new int[26];
            for(char c:word.toCharArray()){
                charFrequency[c-'a']++;
            }
            StringBuilder key=new StringBuilder();
            for(int i=0;i<26;i++){
                key.append('#');
                key.append(charFrequency[i]);
            }
            String key_new=key.toString();
            if(!map.containsKey(key_new)){
                map.put(key_new, new ArrayList());
            }
            map.get(key_new).add(word);
                
            
        }
        return new ArrayList(map.values());
    }
}