class Solution {
    public boolean canJump(int[] nums) {
        
        int n = nums.length;
        boolean []dp = new boolean[n];
        int cur = 0;
        dp[0] = true;
        
        for(int i=0;i<n;i++)
        {
            cur = nums[i];
            
            if(dp[i] && cur!=0)
            {
                if(i+cur>=n-1)
                   return true;
                for(int j=i+1;j<=i+cur && j<n;j++)
                {
                    //System.out.println(i+" "+j);
                    dp[j] = true;
                }
            }
            
        }
        return dp[n-1];
        
    }
}