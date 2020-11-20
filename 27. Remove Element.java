class Solution {
    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        int start = 0;
        int end = n-1;
        int temp  = 0;
        while(start<=end )
        {
            if(nums[start]==val)
            {
                temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                end--;
            }
            else
            {
                start++;
            }
        }
        //System.out.println(end);
        return end+1;
        
    }
}
