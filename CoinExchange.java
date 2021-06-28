class CoinExchange {
    static int coinChange(int[] coins,int amount,int[] dp){
        if(dp[amount]!=0)
            return dp[amount];
        if(amount==0)
            return 0;
        dp[amount] = dp.length;
        for(int coin:coins){
            if(amount-coin>=0){
                dp[amount] = Math.min(dp[amount],coinChange(coins,amount-coin,dp)+1);
            }
        }
        return dp[amount];
    }
    
    public int coinChange(int[] coins, int amount) {
        int dp[] = new int[amount+1];
        int soln = coinChange(coins,amount,dp);
        return soln==dp.length?-1:soln;
        
    }
}
