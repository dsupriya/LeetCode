class Solution {
    public int largestUniqueNumber(int[] nums) {
        int [] count = new int[1001];
        int n = nums.length;
        for(int i=0;i<n;i++)
        {
            count[nums[i]]++;
        }
        for(int i=1000;i>=0;i--)
        {
            if(count[i]==1)
                return i;
        }
        return -1;
    }
}
