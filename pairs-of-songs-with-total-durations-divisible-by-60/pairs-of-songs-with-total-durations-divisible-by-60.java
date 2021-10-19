class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        int count=0;
        
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < time.length; i++) {
            int complement = 60-(time[i]%60);
            if(complement==60)
                complement=0;
            int key=time[i]%60;
            if (map.containsKey(complement)) {
                count+=map.get(complement);
            }
            //map.put(time[i]%60, map.get(time[i])%60+1);
            map.put(key, map.getOrDefault(key, 0) + 1);
        }
        return count;
    }
}