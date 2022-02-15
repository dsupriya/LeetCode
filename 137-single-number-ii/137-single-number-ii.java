class Solution {
    public int singleNumber(int[] nums) {
        int n = nums.length;
        if(n==1)
            return nums[0];
        Arrays.sort(nums);
        
        if(nums[0]!=nums[1])
            return nums[0];
        if(nums[n-1]!=nums[n-2])
            return nums[n-1];
        
        for(int i=1;i<n;)
        {
            if(nums[i]==nums[i-1])
            {
              i = i+3;   
            }
            else
            {
                
             return nums[i-1];
                
            }
        }
        return 0;
        
        
    }
}

// complexicity : sort [nlon] + traversal [n]
//space : o(1) , concidering inplace sort
// basic idea, is after sort numbers will in clusters
// 1,1,1,2,3,3,3 -> 
// i = 1,
// check i and i-1 if not same, should return i-1
// handle start end case