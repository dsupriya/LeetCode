class Solution {
    public int majorityElement(int[] nums) {
        int count,ans,add;
        count =ans =0;
        for(int i : nums)
        {
            if(count ==0)
            {
                ans = i;
            
            }
            add = (ans==i) ? 1: -1;
            count = count+add;
            
        }
        return ans;
        
        
    }
}