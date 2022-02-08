class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        
        int lastNonZero, cur;
        
        lastNonZero = 0;
        cur = 0;
        
        for(;cur<n;cur++)
        {
            if(nums[cur]!=0)
            {
                int temp = nums[lastNonZero];
                nums[lastNonZero] = nums[cur];
                nums[cur] = temp;
                lastNonZero++;
                
            } 
        }
    }
}