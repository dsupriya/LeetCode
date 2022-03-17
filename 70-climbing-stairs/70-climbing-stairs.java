class Solution {
    public int climbStairs(int n) {
        int step1 = 1;
        int step2 = 2;
        if(n==1)
            return step1;
        if(n==2)
            return step2;
        int res = 0;
        for(int i=3;i<=n;i++)
        {
            res = step1+step2;
            step1 = step2;
            step2 = res;
        }
        return res;
        
    }
}