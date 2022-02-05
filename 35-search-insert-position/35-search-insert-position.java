class Solution {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int start,end,mid;
        start = 0;
        end = n-1;
        if(n==1 && nums[0]!=target)
        {
            int ans = nums[0] < target ? 1 : 0;
            return ans;
        }
        
        while(start<end)
        {
            mid = (start+end)/2;
            if(nums[mid] == target)
                return mid;
            else if(nums [mid] > target)
                end = mid - 1;
            else
                start = mid +1;
        }
         
        int ans = nums[start] < target ? start+1 : start;
        return ans;
        
    }
}