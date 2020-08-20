class Solution {
    public int[] sortArrayByParity(int[] a) {
        int n = a.length;
        if(n==0 || n==1)
            return a;
        int [] ans = new int[n];
        int e=0;
        int o=n-1;
        for(int i=0;i<n&&e<=o;i++)
        {
            if(a[i]%2==0)
            {
                ans[e] = a[i];
                e++;
            }
            else
            {
              ans[o] = a[i];
              o--;
            }
        }
        return ans;
        
        
         
        
    }
}
