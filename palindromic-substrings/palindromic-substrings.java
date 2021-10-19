class Solution {
    int count=0;
    public int countSubstrings(String s) {
        
        //call function twice, for even palindrome and for odd
        
        //even
        for(int i=0;i<s.length();i++){
            countPali(s,i,i+1);    
        }
        //odd
        for(int i=0;i<s.length();i++){
            countPali(s,i,i);
        }
        return count;

    }
    
    public void countPali(String s, int left, int right){
        if(left<0 || right>=s.length() || s.charAt(left)!=s.charAt(right))
            return;
        else{
            while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
                left--;
                right++;
                count++;
            }
        }
        
    }
}