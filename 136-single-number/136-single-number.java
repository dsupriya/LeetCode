class Solution {
    public int singleNumber(int[] nums) {
        int ans = 0;
        for(int i=0;i<nums.length;i++)
            ans = ans ^ nums[i];
        return ans;
        
        
    }
}

// 2 ^ 2 =0
// 0 ^ num = num