class Solution {
    int max=Integer.MIN_VALUE;;
    StringBuilder op=new StringBuilder();
    public String longestPalindrome(String s) {
        
//         int start=0;
//         int end=0;
//         int max=0;
        
//         int dp[][]=new int[s.length()+1][s.length()+1];
        
//         for(int i=1;i<s.length()+1;i++){
//             for(int j=1;j<s.length()+1;j++){
//                 if(s.charAt(i-1)==s.charAt(s.length()-j)){
//                     dp[i][j]=1+dp[i-1][j-1];
//                     if(dp[i][j]>max){
//                         max=dp[i][j];
//                         end=i-1;
//                         start=s.length()-j;
//                     }
//                 }
//                 else{
//                     dp[i][j]=0;
//                 }
//             }
//         }
//         System.out.print(max);
//         System.out.print(start);
//         System.out.print(end);
        
//         for(int i=0;i<s.length()+1;i++){
//             for(int j=0;j<s.length()+1;j++){
//                 System.out.print(dp[i][j]);
//             }
//             System.out.println();
//         }
        
//         StringBuilder op=new StringBuilder();
//         for(int i=start;i<=end;i++){
//             op.append(s.charAt(i));
//         }
//         return op.toString();
        
        
        
        
        
        
           //call function twice, for even palindrome and for odd
        
        //even
        for(int i=0;i<s.length();i++){
            countPali(s,i,i+1);    
        }
        //odd
        for(int i=0;i<s.length();i++){
            countPali(s,i,i);
        }
        return op.toString();
        
    }
    
    public void countPali(String s, int left, int right){
        if(left<0 || right>=s.length() || s.charAt(left)!=s.charAt(right))
            return;
        else{
            while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
                left--;
                right++;
               // count++;
            }
            left++;
            right--;
            max=Math.max(max,right-left+1);
            if(max==right-left+1){
                //StringBuilder op=new StringBuilder();
                op.setLength(0);
                for(int i=left;i<=right;i++){
                    op.append(s.charAt(i));
                }
            }
        }
        
    }
}