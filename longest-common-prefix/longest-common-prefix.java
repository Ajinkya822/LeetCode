class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        StringBuilder sb=new StringBuilder();
        if(strs.length==1)
            return strs[0];
        String cmp=strs[0];
        
        
        int index=0;
        while(true){
            for(int i=1;i<strs.length;i++){
                if(index==strs[i].length() || index==cmp.length() || cmp.charAt(index)!=strs[i].charAt(index)){
                    return sb.toString();
                }
            }
            sb.append(cmp.charAt(index));
            index++;
        }
        
    }
}