class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.length()==0)
            return 0;
        
        if(needle.length()>haystack.length())
            return -1;
        
        for(int i=0;i<haystack.length();i++){
            int j=0;
            int temp=i;
            while(j<needle.length() && temp<haystack.length() && haystack.charAt(temp)==needle.charAt(j)){
                temp++;
                j++;
            }
            if(j==needle.length())
                return i;
            if(temp==haystack.length())
                    return -1;
        }
        
        
        return -1;
    }
}