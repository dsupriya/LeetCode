class Solution {
    public int fib(int n) {
        
        if(n==0)
            return 0;
        if(n==1)
            return 1;
        int n_2 = 0;
        int n_1 = 1;
        
        int ans = 0;
        // n = 3;
        for(int i=1;i<n;i++)
        {
            ans = n_2+n_1;
            n_2 = n_1;
            n_1 = ans;
        } 
        return ans;
    }
}