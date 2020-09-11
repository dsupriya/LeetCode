class Solution {
    public void rotate(int[][] a) {
        transpose(a);
        swapRow(a);
        
    }
    public static void transpose(int[][] a)
    {
        int n = a.length;
        if(n==1)
            return;
        for(int i=0;i<n;i++)
        {
            for(int j =i+1;j<n;j++)
            {
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] =temp;
            }
        }
    }
    public static void swapRow(int [][]a)
    {
        int n = a.length;
        if(n==1)
            return;
        for(int i=0;i<n;i++)
        {
            for(int j=0,k=n-1;j<k;j++,k--)
            {
                int temp = a[i][j];
                a[i][j] = a[i][k];
                a[i][k] = temp;
            }
        }
        
    }
}
