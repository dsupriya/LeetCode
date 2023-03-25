class Solution {
    public int removeDuplicates(int[] nums) {
        
        int max = 102;
        
        // mark duplicate numbers with max
        
        int n = nums.length;
        int count = 1;
        
        for(int i=0,j=i+1; i<n && j<n ; )
        {
            //System.out.println(nums[i]);
            if(nums[i]==nums[j])
            {
                nums[j]=max;
                j++;
            }
            else
            {
                //System.out.println("uii" + nums[i]);
                i = j;
                j = i+1;
                count ++;
            }
        }
        Arrays.sort(nums);
        return count;
           
        
    }
}