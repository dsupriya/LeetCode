class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        
        int n = image.length;
        int m = image[0].length;
        boolean [][] visited = new boolean[n][m];
        int original =  image[sr][sc];
        image[sr][sc] = newColor;
        visited[sr][sc] = true;
       
        DFS(image,visited,sr,sc,newColor, original);
        return image;
        
    }
    public void DFS(int[][] image, boolean [][]visited , int sr, int sc, int newColor, int original)
    {
        int n = image.length;
        int m = image[0].length;
        
        int []x = {0,1,0,-1};
        int []y = {1,0,-1,0};
        int row, col;
        for(int i=0;i<4;i++)
        {
            row = sr+x[i];
            col = sc+y[i];
            if(row<n && row>=0 && col<m && col>=0 && visited[row][col]==false && image[row][col]==original) {
                image[row][col] = newColor;
                visited [row][col] = true; 
                DFS(image,visited,row,col,newColor,original);
            }
        }
        return;
            
    }
}