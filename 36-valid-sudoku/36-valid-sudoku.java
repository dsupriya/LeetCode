class Solution {
    public boolean isValidSudoku(char[][] board) { 
        
        return validatedRow( board) && validatedCol(board) && validateSqaure(board);
        
    }
    public boolean validatedRow(char[][] board)
    {
        HashSet <Integer> hs = new HashSet();
        for(int i=0 ;i<9;i++)
        {
            hs = new HashSet();
            for(int j=0;j<9;j++)
            {
                if(board[i][j]!='.')
                {
                    int digit = board[i][j] - '0';
                    if(hs.contains(digit))
                        return false;
                    hs.add(digit);
                }
            }
        }
        return true;
    }
    public boolean validatedCol(char[][] board)
    {
        HashSet <Integer> hs = new HashSet();
        for(int i=0 ;i<9;i++)
        {
            hs = new HashSet();
            for(int j=0;j<9;j++)
            {
                if(board[j][i]!='.')
                {
                    int digit = board[j][i] - '0';
                    if(hs.contains(digit))
                        return false;
                    hs.add(digit);
                }
            }
        }
        return true;
    }
    public boolean validateSqaure(char[][] board)
    {
        for(int i=0;i<9;i=i+3)
        {
            for(int j=0;j<9;j=j+3)
            {
                if(!validateSmallSqaure(board,i,j))
                    return false;
            }
        }
        return true;
    }
    
    public boolean validateSmallSqaure (char[][] board, int row, int col)
    {
        HashSet <Integer> hs = new HashSet();
        for(int i=row;i<row+3;i++)
        {
            for(int j= col;j<col+3;j++)
            {
                if(board[i][j]!='.')
                {
                    int digit = board[i][j] - '0';
                    if(hs.contains(digit))
                        return false;
                    hs.add(digit);
                }
            }
        }
        return true;
    }
}