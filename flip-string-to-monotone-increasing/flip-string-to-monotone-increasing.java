class Solution {
    public int minFlipsMonoIncr(String s) {
        int flipcount=0;
        int onescount=0;
        int op=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0'){
                flipcount++;
            }
            else{
                onescount++;
            }
            flipcount=Math.min(flipcount, onescount);
        }
        return flipcount;
    }
}