class Solution {
    public int coinChange(int[] coins, int amount) {
        int [] dp = new int[amount+1];
        if(coins.length==0)
            return -1;
        if(amount ==0)
            return 0;
        
        dp[0] = 0;
        int n = coins.length;
        for(int i=0;i<n;i++)
        {
            if(coins[i]<=amount)
                dp[coins[i]] = 1;
        }
        for(int i=1;i<=amount;i++)
        {
            if(dp[i]!=1)
                dp[i] = Integer.MAX_VALUE;
        }
        int cur = 0;
        int min = Integer.MAX_VALUE;
        int rs = 0;
        for(int i=1;i<=amount;i++)
        {
            min = Integer.MAX_VALUE;
            rs = i;
            cur = Integer.MAX_VALUE;
            if(dp[rs] ==1)
            {
                //System.out.println(rs);
                continue;
            }
                
            for(int j=0;j<n;j++)
            {
               
                if(rs-coins[j]>=0)
                {
                    if(dp[rs-coins[j]]==Integer.MAX_VALUE)
                        cur = Integer.MAX_VALUE;
                    else
                        cur=(1+dp[rs-coins[j]]);
                    min = Math.min(cur,min);
                }
            }
            //System.out.println(rs+" "+min+" "+Integer.MAX_VALUE);
            dp[i] = min;
        }
        return dp[amount]==Integer.MAX_VALUE ? -1: dp[amount];
        
    }
}
