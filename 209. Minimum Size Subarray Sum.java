class Solution {
    public int minSubArrayLen(int s, int[] nums) {
        
        int min = Integer.MAX_VALUE;
        int n = nums.length;
        int sum = 0;
        for(int i=0,j=0;i<n&&j<n;j++)
        {
            if(nums[j]>s)
                return 1;
            sum = sum+nums[j];
            while(sum>=s)
            {
                min = Math.min(min,j+1-i);
                sum = sum-nums[i];
                i++;
            }
            
            
               
           
        }
         int ans = min == Integer.MAX_VALUE ? 0 :min;
        return ans;
    }
}
