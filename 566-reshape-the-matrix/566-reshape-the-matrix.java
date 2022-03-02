class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int k, l, n, m;
        
        n = mat.length;
        m = mat[0].length;
        k =l =0;
        
        if(r==n && m ==c)
            return mat;
        if(m*n != r*c)
            return mat;
        int [][] res = new int[r][c];
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(l>=c)
                {
                   k++;
                   l = 0; 
                }
                
                res[k][l] = mat[i][j];
                l++;
            }
        }
        return  res;
    }
}