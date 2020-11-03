class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        if(n==0)
            return false;
        int m = matrix[0].length;
        int row = n-1;
        int col = 0;
        
        while(row>=0 && col< m)
        {
            if(matrix[row][col]<target)
                col++;
            else if(matrix[row][col]>target)
                row--;
            else
                return true;
        }
        return false;
        
    }
}
