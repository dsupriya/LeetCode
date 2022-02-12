class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int n = nums.length;
        if(n==1)
            return nums[0];
        HashSet <Integer> hs = new HashSet();
        int start,end,cur,max;
        start = end = cur = max = 0;
        
        while(start<n && end < n)
        {
            if(!hs.contains(nums[end]))
            {
                cur =  cur + nums[end];
                hs.add(nums[end]);
                end++;
            }
            else
            {
                cur = cur - nums[start];
                hs.remove(nums[start]);
                start++;
            }
            max = cur > max ? cur :max;
        }
        
        return max;
    }
    
}
