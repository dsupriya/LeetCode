class Solution {
    public int longestPalindromeSubseq(String s) {
        int n = s.length();
        if(n==0)
            return 0;
        int [][] memo = new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
                memo[i][j] =-1;
        }
        int ans = find(s,0,n-1,memo);
        return ans;
        
    }
    public int find(String s, int start, int end,int [][]memo)
    {
        if(start>end)
            return 0;
        if(start==end)
            return 1;
        if(memo[start][end]!=-1)
            return memo[start][end];
        if(s.charAt(start)==s.charAt(end))
        {
             memo[start][end]= 2+find(s,start+1,end-1,memo);
            return memo[start][end];
        }
            
        int op1 = find(s,start+1,end,memo);
        int op2 = find(s,start,end-1,memo);
        memo[start][end]= Math.max(op1,op2);
        return memo[start][end];
    }
}
