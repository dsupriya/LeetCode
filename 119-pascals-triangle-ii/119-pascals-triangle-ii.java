class Solution {
    public List<Integer> getRow(int numRows) {
        
        numRows++;
        Integer [] base = {1};
        Integer []prev = base;
        List<Integer> res = new LinkedList();
        Integer [] nextRow = base;
       
        for(int i=2;i<=numRows;i++)
        {
            nextRow = getnextRow(prev);
            prev = nextRow;
            
        }
        res = Arrays.asList(nextRow);
        return res;
        
    }
    public Integer[] getnextRow(Integer []prev)
    {
        int n = prev.length;
        Integer []next = new Integer[n+1];
        next[0] = next[n] = 1;
        int first,second;
        first=0;
        second=1;
        
        for(int i=1;i<n;i++)
        {
            next[i] = prev[first]+prev[second];
            first++;
            second++;
        }
        return next;
    }
    
}
    
    