class Solution {
    public int diagonalSum(int[][] mat) {
        int n = mat.length;
        boolean sub = (n%2==0) ? false : true;
        int mid = n/2;
        int sum = 0;
        for(int i=0;i<n;i++)
        {
            for(int j =0;j<n;j++)
            {
                if(i==j || (i+j)==n-1)
                    sum = sum+mat[i][j];
            }
        }
        System.out.println(sum);
        
        return sum;
        
    }
}
