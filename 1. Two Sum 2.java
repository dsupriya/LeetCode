class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int [] ans = new int [2];
        HashMap <Integer,Integer> hm = new HashMap();
        int rem = 0;
        for(int i=0;i<n;i++)
        {
            rem = target-nums[i];
            if(hm.containsKey(rem))
            {
                ans[0] = hm.get(rem);
                ans[1] = i;
                break;
            }
            else
                hm.put(nums[i],i);
        }
        return ans;
        
    }
}
