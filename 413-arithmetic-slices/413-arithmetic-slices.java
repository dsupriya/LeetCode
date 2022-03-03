class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int n = nums.length;
        int res = 0;
        int []dp = new int[n];
        if(n==1 || n==2)
            return res;
        dp[0]=dp[1]=0;
        
        for(int i=2;i<n;i++)
        {
            if(nums[i]-nums[i-1] == nums[i-1]-nums[i-2])
            {
                dp[i] = dp[i-1]+1;
            }
            res = dp[i]+res;
        }
        return res;
        
    }
}