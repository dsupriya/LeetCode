class Solution {
    public int maximalSquare(char[][] a) {
        int n = a.length;
        if(n==0)
            return 0;
        
        
                
        int max = 0;
        int m = a[0].length;
        int [][] dp = new int [n][m];
        int [][] matrix = new int [n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(a[i][j]=='1')
                    matrix[i][j] = 1;
                else
                    matrix[i][j] = 0;
                    
            }
        }
        //base condition
        for(int i=0;i<m;i++)
        {
            dp[0][i] = matrix[0][i];
            max = Math.max(max, dp[0][i]);
            
        }
            
        for(int i=0;i<n;i++)
        {
            dp[i][0] = matrix[i][0];
            max = Math.max(max, dp[i][0]);
        }
            
        
       
        int cur  = 0;
        for(int i=1;i<n;i++)
        {
            for(int j=1;j<m;j++)
            {
                if(matrix[i][j]!=0)
                {
                   cur = Math.min(dp[i-1][j-1],Math.min(dp[i][j-1],dp[i-1][j]));
                    //System.out.println(cur);
                   dp[i][j] = cur+1; 
                   max = Math.max(max,dp[i][j]); 
                    
                }
            }
        }
        return  max*max;
    }
}
