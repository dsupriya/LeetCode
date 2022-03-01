class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap <Integer,Integer> hm  = new HashMap();
        
        int rem = 0;
        int []ans = new int[2];
        
        for(int i=0;i<nums.length;i++)
        { 
            rem = target - nums[i];
            if(hm.containsKey(rem))
            {
                ans[0] = i;
                ans[1] = hm.get(rem);
                return ans;
            }
            hm.put(nums[i],i);
        
        }
        return ans;
        
    }
}