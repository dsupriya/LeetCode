class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int right_max;
        int ans,max;
        ans = max =0;
        right_max= nums[0];
        for(int i=1;i<n;i++)
        {
            right_max = Math.max(right_max,nums[i-1]);
            ans = (right_max-1)*(nums[i]-1);
            max = Math.max(ans,max);
           
        }
        return max;
    }
}
