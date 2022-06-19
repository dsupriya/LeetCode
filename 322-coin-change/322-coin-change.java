class Solution {
    public int coinChange(int[] coins, int amount) {
       
        if(amount == 0)
            return 0;
        int []dp = new int[amount+1];
        Arrays.fill(dp,-1);
        int ans = coinChangeDp(coins,amount,dp);
        return ans == Integer.MAX_VALUE ? -1 : ans;
        
    }
    
    public int coinChangeDp(int []coins, int amount , int []dp)
    {
        if(amount==0)
            return 0;
        if(amount<0)
            return Integer.MAX_VALUE;
        if(dp[amount]!=-1)
            return dp[amount];
        int ans = Integer.MAX_VALUE;
        for(int i=0;i<coins.length;i++)
        {
            int rem = amount - coins[i];
            int coins_rem  = coinChangeDp(coins,rem, dp);
            if ( coins_rem != Integer.MAX_VALUE)
                coins_rem = 1+coins_rem;
            ans = Math.min(coins_rem, ans);
                
        }
        dp[amount] = ans;
        return ans;
    }
}