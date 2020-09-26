class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int []left = new int[n];
        int []right = new int [n];
        int max = -1;
        for(int i=0;i<n;i++)
        {
            left[i] = Math.max(height[i],max);
            max = Math.max(height[i],max);
        }
        max = -1;
        for(int i=n-1;i>=0;i--)
        {
            right[i] = Math.max(height[i],max);
            max = Math.max(height[i],max);
        }
        int ans = 0;
        for(int i=0;i<n;i++)
        {
            ans = ans+Math.min(left[i],right[i])-height[i];
        }
        return ans;
    }
}
