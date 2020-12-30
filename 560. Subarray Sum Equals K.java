class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int cur_sum = 0;
        
        int sum = 0;
        int count = 0;
        HashMap <Integer,Integer> hm = new HashMap();
        hm.put(0,1);
        int val = 0;
        
        for(int i=0;i<n;i++)
        {
            sum = sum+nums[i];
            if(hm.containsKey(sum-k))
                count = count+hm.get(sum-k);
            val = hm.getOrDefault(sum,0);
            hm.put(sum,val+1);
            
        }
        return count;
    }
}
