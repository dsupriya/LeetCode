class Solution {
    public List<List<Integer>> subsets(int[] nums) { 
        
        LinkedList <Integer> input = new LinkedList();
        LinkedList <Integer> output = new LinkedList();
        List<List<Integer>>  res = new LinkedList();
        
        for(int i=0;i<nums.length;i++)
            input.add(nums[i]);
        subsets(input,output,res);
        return res;
    }
    public void subsets(LinkedList <Integer> input, LinkedList <Integer> output, List<List<Integer>> res)
    {
        if(input.size()==0)
        {
            res.add(output);
            return;
        }
        LinkedList <Integer> op1 = new LinkedList(output);
        LinkedList <Integer> op2 = new LinkedList(output);
        op1.add(input.get(0));
        
        
        LinkedList ip = new LinkedList(input);
        ip.remove(0);
        
        subsets(ip,op1,res);
        subsets(ip,op2,res);
        
        return;
        
        
        
    }
}