class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        
        LinkedList <Cell> q = new LinkedList<Cell>();
        Cell start = new Cell(sr,sc);
        int n = image.length;
        int m = image[0].length;
        boolean [][]visited = new boolean [n][m];
        visited [sr][sc] =true;
        int []neigh = {0,1,0,-1,1,0,-1,0};
        int row, col;
        row=col=0;
        q.add(start);
        int c = image[sr][sc];
        while(!q.isEmpty())
        {
            Cell temp = q.remove(0);
            image[temp.x][temp.y] = newColor;
           
            for(int i=0;i<8;i=i+2)
            {
                row = temp.x+neigh[i];
                col = temp.y+neigh[i+1];
                if(row>=0 && row<n && col>=0 && col<m && image[row][col]==c && visited[row][col]==false)
                {
                    Cell t = new Cell(row,col);
                    q.add(t);
                    visited[row][col] = true;
                }
            }
        }
        return image;
        
    }
}

class Cell
{
    int x, y;
    Cell(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
}
