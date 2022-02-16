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
            //System.out.println("start "+ start);
            res.add(new LinkedList(cur));
            return;
        }
        if(start>n)
        {
            return;
        }
        cur.add(start);
        getCombinations(n,k,start+1,cur,res);
        
        LinkedList <Integer> excluded = new LinkedList(cur);
        cur.removeLast();
        //System.out.println(cur+ "\n");
        
        getCombinations(n,k,start+1,cur,res);
        return;
    }
}