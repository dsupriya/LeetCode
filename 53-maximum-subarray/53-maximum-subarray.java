class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        
        int cur,max;
        cur = 0;
        max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            cur = cur+nums[i];
            max = Math.max(max,cur);
            cur = cur<0 ? 0 : cur;
        }
        return max;
        
    }
}