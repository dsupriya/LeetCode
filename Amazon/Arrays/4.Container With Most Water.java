class Solution {
    public int maxArea(int[] height) {
        
        int n = height.length;
        int l,r;
        l=0;
        r=n-1;
        int ans,cur;
        ans=cur=0;
        while(l<r)
        {
            int length = Math.min(height[l],height[r]);
            int width = r-l;
            cur = length*width;
            ans = Math.max(cur,ans);
            if(height[l]<height[r])
                l++;
            else
                r--;
            
        }
        return ans;
        
    }
}
