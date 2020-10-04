class Solution {
    public int[] twoSum(int[] a, int target) {
        
        int n = a.length;
        int []ans = new int [2];
        int l,r;
        l=0;
        r=n-1;
        while(l<r)
        {
            if(a[l]+a[r]==target)
            {
                ans[0] = l+1;
                ans[1] = r+1;
                break;
            }
            else if(a[l]+a[r]>target)
                r--;
            else l++;
        }
        return ans;
        
    }
}
