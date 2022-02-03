class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int base = -1; 
        if(n==0)
            return base;
        
        int start,end,mid;
        start = 0;
        end = n-1;
        mid = (start+end)/2;
        while(start<=end)
        {
            mid = (start+end)/2;
            if(nums[mid] == target)
                return mid;
            else if(nums[mid]<target)
                start = mid+1;
            else
                end = mid-1;
       }
        
        return base;
        
    }
}
//0 1 2 3 4 5
