class Solution {
    public boolean isPalindrome(String s) {
        s.toLowerCase();
        int left=0;
        int right=s.length()-1;
        char l;
        char r;
        while(left<=right){
            l=s.charAt(left);
            r=s.charAt(right);
            if(Character.isLetterOrDigit(l) && Character.isLetterOrDigit(r)){
                if(Character.toLowerCase(l)==Character.toLowerCase(r)){
                    left++;
                    right--;
                    continue;
                }
                else{
                    return false;
                }
            }
            if(!Character.isLetterOrDigit(l)){
                left++;
            }
            if(!Character.isLetterOrDigit(r)){
                right--;
            }
        }
        return true;
    }
}