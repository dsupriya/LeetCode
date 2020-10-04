class Solution {
    public int threeSumClosest(int[] nums, int target) {
        
        Arrays.sort(nums);
        int n = nums.length;
        
        int diff = Integer.MAX_VALUE;
        int low,high,sum;
        for(int i=0;i<n;i++)
        {
            low = i+1;
            high = n-1;
            while(low<high)
            {
                sum = nums[i]+nums[low]+nums[high];
                if (Math.abs(target - sum) < Math.abs(diff))
                    diff = target - sum;
                if(diff==0)
                    return target;
                
                if(sum<target)
                    low++;
                else
                    high--;
                    
            }
            
        }
        return target-diff;
        
    }
}
