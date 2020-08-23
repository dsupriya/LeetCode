class Solution {
    public int findSpecialInteger(int[] a) {
        
        int n = a.length;
        if(n==1)
            return a[0];
        
        int ans = a[0];
        int add = (int)Math.ceil(0.25*n);
        for(int i=0;i+add<n;i++)
        {
            if(a[i]==a[i+add])
            {
                ans = a[i];
                break;
            }
            
        }
        return ans;
    }
}
