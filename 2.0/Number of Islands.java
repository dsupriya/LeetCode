class Solution {
    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        boolean [][] visited = new boolean[m][n];
        
        int ans = 0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
               
                if(grid[i][j]=='1' && visited[i][j]==false)
                {
                    
                    ans = ans+1;
                    BFS(grid,visited,i,j);
                }
            }
        }
        return ans;
        
    }
    public void BFS(char[][] grid , boolean [][]visited, int row, int col)
    {
        int m = grid.length;
        int n = grid[0].length;
        visited [row][col] = true;
        Cell start = new Cell(row,col);
        
        LinkedList <Cell> q = new LinkedList();
        q.add(start);
        
        int[]a ={0,1,0,-1};
        int[]b ={1,0,-1,0};
        
        while(!q.isEmpty())
        {
            Cell cur = q.remove(0);
            
            for(int i=0;i<4;i++)
            {
                int r = cur.x + a[i];
                int c = cur.y + b[i];
                
                if(r<m && r>=0 && c<n && c>=0 && grid[r][c]=='1' && visited[r][c]==false)
                {
                    Cell next = new Cell(r,c);
                    visited[r][c] = true;
                    q.add(next);
                }
            }
        }
        
    }
}

class Cell
{
    int x,y;
    Cell(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
}
