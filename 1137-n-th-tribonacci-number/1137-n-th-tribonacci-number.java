class Solution {
    public int tribonacci(int n) {
        int n_3 = 0;
        int n_2 = 1;
        int n_1 = 1;
        if(n == 0)
            return n_3;
        if(n==1 || n==2)
            return n_1;
        int res = 0;
        for(int i=3;i<=n;i++)
        {
            res = n_3+n_2+n_1;
            n_3 = n_2;
            n_2 = n_1;
            n_1 = res;
        }
        return res;
    }
}