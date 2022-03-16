class Solution {
    public int fib(int n) {
        int n_2 = 0;
        int n_1 = 1;
        if(n == 0)
            return n_2;
        if(n==1)
            return n_1;
        int res = 0;
        for(int i=2;i<=n;i++)
        {
            res = n_2+n_1;
            n_2 = n_1;
            n_1 = res;
        }
        return res;
        
    }
}