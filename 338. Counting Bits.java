class Solution {
    public int[] countBits(int num) {
        
        int []a = new int[num+1];
        int s,e;
        s=e=1;
        a[0] = 0;
        int t = 0;
        for(int i=1;i<=num;i++)
        {
            t = s/2;
            if((i-t)<t)
                a[i] = a[i-s];
            else
                a[i] = a[i-s]+1;
            
            if(e==i)
            {
                s=e+1;
                e=(s*2);
                e=e-1;
            }
            
            
        }
        return a;
        
    }
}
