class Solution {
    public int coinChange(int[] coins, int amount) {
        int n=coins.length;
        int dp[][]=new int[n+1][amount+1];
        Arrays.sort(coins);
        int flag=0;
        if(amount==0)
            return 0;

        for(int col=1;col<amount+1;col++){
            dp[0][col]=1001;
        }
        for(int row=0;row<n+1;row++){
            dp[row][0]=0;
        }
        
        for(int i=1;i<n+1;i++){
            for(int j=1;j<amount+1;j++){
                // if(j==0){
                //     dp[i][j]=0;
                // }
                if(coins[i-1]>j){
                    dp[i][j]=dp[i-1][j];
                }
                else{
                    dp[i][j]=Math.min(dp[i-1][j], 1+dp[i][j-coins[i-1]]);
                    flag=1;
                }
                
            }
        }
        if(dp[n][amount]>1000)
            return -1;
        
        
        return dp[n][amount];
    }
}