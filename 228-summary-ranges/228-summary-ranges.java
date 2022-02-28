class Solution {
    public List<String> summaryRanges(int[] nums) {
        
        List <String> ans = new ArrayList();
        
        int n = nums.length;
        if(n==0)
        {
            return ans;
        }
        if(n==1)
        {
            ans.add(new String("" + nums[0]));
            return ans;
        }
        int prev,next;
        prev=next=0;
        
        for(int i=1;i<n;i++)
        {
            if(nums[i] == nums[i-1]+1)
            {
                next = i;
            }
            else 
            {
                String renge;
                if(prev==next)
                {
                     renge = "" +nums[prev];
                }
                else
                {
                     renge = nums[prev]+"->"+nums[next];
                }
                ans.add(renge);
                prev=next=i;
            }
            
        }
        String renge;
        if(prev==next)
            renge = "" +nums[prev];
        else
            renge = nums[prev]+"->"+nums[next];
        ans.add(renge);
        return ans;
        
    }
}