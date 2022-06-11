class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)
            return false;
        if(x==0)
            return true;
        int copy=x;
        int reverse=0;
        while(copy>0){
            //mod to get last digit
            int temp=copy%10;
            reverse=reverse*10+temp;
            //remove last digit
            copy=copy/10;
        }
        if(x==reverse)
            return true;
        else
            return false;
    }
}