class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int []left = new int[n];
        int []right = new int [n];
        
        int prod = 1;
        for(int i=0;i<n;i++)
        {
            prod = prod * nums[i];
            left[i] = prod;
        }
        prod = 1;
        for(int i=n-1;i>=0;i--)
        {
            prod = prod * nums[i];
            right[i] = prod;
        }
        int [] ans = new int [n];
        int l,r;
        l=r=0;
        for(int i=0;i<n;i++)
        {
            l = i==0 ? 1 : left[i-1];
            r = i==n-1 ? 1 : right[i+1];
            ans[i] = l*r;
            
        }
        return ans;
        
    }
}
