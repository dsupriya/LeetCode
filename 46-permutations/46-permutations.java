class Solution {
    public List<List<Integer>> permute(int[] nums) {
        LinkedList <Integer> cur = new LinkedList();
        
        List<List<Integer>> res= new LinkedList();
        int n = nums.length;
        boolean []visited = new boolean[n];
        getPermutations(0,visited,nums,cur,res);
        return res;
    }
    public void getPermutations(int pos,  boolean []visited ,int[] nums,LinkedList <Integer> cur,  List<List<Integer>> res )
    {
        int n = nums.length;
        if(cur.size()==n)
        {
            LinkedList <Integer> ans = new LinkedList(cur);
            res.add(ans);
            return;
        }
        if(pos>=n)
            return;
        
        for(int i=0;i<n;i++)
        {
            if(visited[i] == false)
            {
                cur.add(nums[i]);
                visited[i] = true;
                getPermutations(pos+1,visited,nums, cur, res);
                cur.removeLast();
                visited[i] = false;
            }
        }
        
    }
}