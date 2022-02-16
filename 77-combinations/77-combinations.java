class Solution {
    public List<List<Integer>> combine(int n, int k) {
        
        List<List<Integer>> res = new LinkedList();
        
        LinkedList <Integer> cur = new LinkedList();
        
        getCombinations(n,k,1,cur, res);
        return res;
        
    }
    
    public void getCombinations(int n, int k, int start,LinkedList <Integer> cur,  List<List<Integer>> res)
    {
        if(cur.size()==k)
        {
            res.add(new LinkedList(cur));
            return;
        }
        if(start>n)
        {
            return;
        }
        cur.add(start);
        getCombinations(n,k,start+1,cur,res);
        
        cur.removeLast();
        getCombinations(n,k,start+1,cur,res);
        return;
    }
}