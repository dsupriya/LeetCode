class Solution {
    public int threeSumSmaller(int[] nums, int target) {
        Arrays.sort(nums);
        if(nums.length==0)
            return 0;
        int sum,cur_dif,dif,ans;
        dif = Integer.MAX_VALUE;
        int low,high;
        ans = 0;
        for(int i=0;i<nums.length;i++)
        {
            low = i+1;
            high = nums.length-1;
            sum = 0;
            while(low<high)
            {
                sum = nums[i]+nums[low]+nums[high];
                if(sum<target)
                {
                    ans = ans+(high-low);
                    low++;
                    
                }
                    
                else
                {
                   high--;
                }
            }
        }
        return ans;
        
    }
}
