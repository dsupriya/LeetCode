class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        boolean [][] visited = new boolean[n][m];
        int ans = 0;
        for(int i=0;i<n;i++)
        {
            for (int j = 0;j<m;j++)
            {
                if(grid[i][j]==1 && visited[i][j]==false)
                {
                    visited[i][j]=true;
                    int cur = DFS(grid,visited,i,j,1);
                    if(cur>ans)
                        ans = cur;
                }
            }
        }
        return ans;
    }
    public int DFS(int[][] image, boolean [][]visited , int sr, int sc, int area)
    {
        int n = image.length;
        int m = image[0].length;
        
        
        int []x = {0,1,0,-1};
        int []y = {1,0,-1,0};
        int row, col;
        int cur = 1;
        for(int i=0;i<4;i++)
        {
            row = sr+x[i];
            col = sc+y[i];
            if(row<n && row>=0 && col<m && col>=0 && visited[row][col]==false && image[row][col]==1) {
                visited [row][col] = true; 
                cur = cur + DFS(image,visited,row,col,area++);
                
            }
        }
        return cur;
            
    }
}