class Solution {
    public int countBinarySubstrings(String s) {
        int current=1;
        int prev=0;
        int count=0;
        
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)!=s.charAt(i-1)){
                count+=Math.min(current, prev);
                prev=current;
                current=1;
            }
            else
                current++;
        }
        
        return count+ Math.min(prev, current);
    }
}