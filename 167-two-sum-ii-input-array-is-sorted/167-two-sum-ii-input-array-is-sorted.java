class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int n = nums.length;
        int left,right;
        left = 0;
        right = n-1;
        int []ans = new int[2];
        
        while(left<right)
        {
           int cur =  nums[left] + nums[right];
           if(cur == target)
           {
               ans[0] = left+1;
               ans[1] = right+1;
               break;
           } 
            else if (cur < target)
               left++;
            else
                right --;
        }
        return ans;
        
    }
}