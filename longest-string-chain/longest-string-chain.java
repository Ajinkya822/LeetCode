class Solution {
    public int longestStrChain(String[] words) {
        int result=1;
        int temp=0;
        HashMap<String,Integer> map=new HashMap<>();
        Arrays.sort(words, (a,b) -> a.length() - b.length());
        for(String w:words){
            map.put(w,1);
            
            for(int i=0;i<w.length();i++){
                StringBuffer sb=new StringBuffer(w);
                String previous=sb.deleteCharAt(i).toString();
                if(map.containsKey(previous)){
                    temp=map.get(previous);
                    map.put(w,Math.max(map.get(w), temp+1));
                    result=Math.max(result, map.get(w));
                }
            }
        }
        
        
        return result;
    }
}