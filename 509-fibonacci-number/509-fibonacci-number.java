import java.util.*;
class Solution {
    public int fib(int n) {
        //int []dp = new int[n+1];
        //Arrays.fill(dp,-1);
        //return fib_rec(n,dp);
        return fib_itr(n);
        
    }
    
    /* recursive solution
    public int fib_rec(int n,int []dp)
    {
        if(dp[n]!=-1)
            return dp[n];
        
        if(n==0)
        {
            dp[0] = 0;
            return 0;
        }
        if(n==1)
        {
            dp[1] = 1;
            return 1;
        }
        
        int cur =  fib_rec(n-1,dp)+ fib_rec(n-2,dp);
        dp[n] = cur;
        
        return cur;
    }*/
    
    
    public int fib_itr(int n)
    {
        if(n<=1)
            return n;
        int n_2 = 0;
        int n_1 = 1;
        int cur = 0;
        for(int i=2;i<=n;i++)
        {
            cur = n_2 + n_1;
            n_2 = n_1;
            n_1 = cur;
        }
        
        
        return cur;
    }
}