class Solution {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int s = 0;
        int e = n-1;
        int mid = 0;
        while(s<=e)
        {
            mid = (s+e)/2;
            if(nums[mid]==target)
                return mid;
            if(nums[mid]>target)
            {
                if(mid-1>=0 && nums[mid-1]<target)
                    return mid;
                if(mid==0)
                    return 0;
                e = mid-1;
                
            }
            else
            {
                if(mid+1<n && target<nums[mid+1])
                    return mid+1;
                if(mid+1==n)
                    return mid+1;
                s = mid+1;
            }
        }
        return -1;
    }
}
