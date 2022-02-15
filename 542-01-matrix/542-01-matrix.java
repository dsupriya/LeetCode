class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        boolean [][] visited = new boolean [n][m];
        int [][] ans = new int [n][m];
        
        LinkedList <Cell> q = new LinkedList();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(mat[i][j]==0)
                {
                    Cell start = new Cell(i,j,0);
                    q.add(start);
                    visited[i][j] = true;
                    
                }
            }
        }
        
        int []x = {1,-1,0,0};
        int []y = {0,0,1,-1};
        
        
        while(!q.isEmpty())
        {
            Cell cur = q.removeFirst();
            int row = cur.x;
            int col = cur.y;
            
            for(int i=0;i<4;i++)
            {
                int r = row+x[i];
                int c = col+y[i];
                if(r<n && r>=0 && c<m && c>=0 &&visited[r][c]==false )
                {
                    Cell next = new Cell(r,c,cur.level+1);
                    visited[r][c] = true;
                    q.add(next);
                    ans[r][c] = cur.level+1;
                }
            }
            
        }
        
        return ans;
        
    }
}

class Cell{
    Integer x,y,level;
    Cell(int x, int y, int level)
    {
        this.x = x;
        this.y = y;
        this.level = level;
    }
}