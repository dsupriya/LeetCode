class Solution {
    public boolean judgeCircle(String moves) {
        int n = moves.length();
        int row,col;
        row=col=0;
        char c;
        for(int i=0;i<n;i++)
        {
            c = moves.charAt(i);
            if(c=='U')
                row=row-1;
            else if(c=='D')
                row=row+1;
            else if(c=='L')
                col=col-1;
            else if(c=='R')
                col=col+1;
            
        }
        if(row==0&&col==0)
            return true;
        else return false;
        
    }
}
