class Solution {
    public int numIslands(char[][] g) {
        int n =g.length;
        int m=0;
        if(n>=1)
            m= g[0].length;
        
        int ans = 0;
        
        boolean visited[][] = new boolean[n][m];
        
        for(int i=0;i<n;i++)
        {
            
            for(int j=0;j<m;j++)
            {
                if(g[i][j]=='1' && visited[i][j] ==false)
                {
                    
                    visited[i][j] = true;
                    BFS(g,visited,n,m,i,j);
                    ans++;
                    
                }
            }
            
        }
        return ans;
    }
    
    public static void BFS(char[][] g, boolean [][]visited, int n,int m, int s1, int s2)
    {
        LinkedList <Cell> q = new LinkedList<Cell>();
        Cell z = new Cell(s1,s2);
        q.add(z);
        int [] a = new int[]{0,1,0,-1,1,0,-1,0};
        int r,c,row,col;
        r=c=row=col=0;
        while(q.isEmpty()!=true)
        {
            Cell temp = q.remove(0);
            
            for(int i=0;i<8;i=i+2)
            {
                row = temp.x+a[i];
                col = temp.y+a[i+1];
                if(row>=0 && col>=0 && row<n&& col<m && visited[row][col]==false&&
                  g[row][col]=='1')
                {
                    Cell cur = new Cell(row,col);
                    q.add(cur);
                    visited[row][col] = true;
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
    Cell()
    {
        this.x=-1;
        this.y=-1;
    }
}
