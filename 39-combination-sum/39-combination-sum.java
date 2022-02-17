class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        
        LinkedList <Integer> cur = new LinkedList();
        List<List<Integer>>res =  new LinkedList();
        getcombinationSum(0,target,candidates, cur,res);
        
        return res;
        
    
    }
    public void getcombinationSum(int start, int target, int []nums, LinkedList <Integer> cur,  List<List<Integer>>res)
    {
        int n = nums.length;
        
        if(target==0)
        {
            LinkedList <Integer> ans = new LinkedList(cur);
            res.add(ans);
            return;
        }
        if (start >= n || target < 0)
        {
            return;
        }
        // pick start element
        cur.add(nums[start]);
        getcombinationSum(start,target-nums[start],nums,cur,res);
        
        //do not pick
        cur.removeLast();
        getcombinationSum(start+1,target,nums,cur,res);
        
        return;
    }
}