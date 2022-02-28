class Solution {
    public int maxSubArray(int[] nums) {
        
        int cur = 0;
        
        int max = Integer.MIN_VALUE;
        
        for(int n :nums)
        {
            cur = cur + n;
            max = Math.max(cur,max);
            if(cur<0)
                cur = 0;
        }
        return max;
    }
   
}