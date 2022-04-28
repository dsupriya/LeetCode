class Solution {
    public int rob(int[] nums) {
        
        int n = nums.length;
        if(n==1)
            return nums[0];
        int start = maxProfit(Arrays.copyOfRange(nums,0,n-1));
        int end = maxProfit(Arrays.copyOfRange(nums,1,n));
        return Math.max(start,end);
        
    }
    public int maxProfit(int []nums)
    {
        int n = nums.length;
        if(n==1)
            return nums[0];
        int [] dp = new int [n];
        int max;
        if(n==2)
            return Math.max(nums[0],nums[1]);
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0],nums[1]);
        max = Math.max(dp[0],dp[1]);
        
        for(int i=2;i<n;i++)
        {
            dp[i] = Math.max(dp[i-1],dp[i-2]+nums[i]);
            max  = Math.max(max,dp[i]);
        }
        return max;
    }
}

// idea is to take first to n-1 and run house robber with 
// then 1 to n 
// take max of both