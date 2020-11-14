class Solution {
    public void nextPermutation(int[] nums) {
        
        int n = nums.length;
        if(n==0)
            return;
        int swapIndex, nextBig;
        boolean flag = false;
        swapIndex=nextBig=0;
        
        for(int i=n-1;i>0;i--)
        {
            //System.out.println(i);
            System.out.println(nums[i]+" "+nums[i-1]);
            if(nums[i]>nums[i-1])
            {
                flag = true;
                swapIndex =  i-1;
                System.out.println(i-1);
                break;
            }
            
        }
        if(!flag)
        {
            Arrays.sort(nums);
            return;
        }
        int large = Integer.MAX_VALUE;
        for(int i = swapIndex+1;i<n;i++)
        {
            if(nums[swapIndex]<nums[i] && nums[i]<=large)
            {
                large = nums[i];
                nextBig = i;
                
            }
        }
        //swap
        int t = nums[swapIndex];
        nums[swapIndex] = nums[nextBig];
        nums[nextBig] = t;
        //reverse
        reverse(nums,swapIndex+1,n-1);
        
        
    }
    public void reverse (int [] nums,int start, int end )
    {
        int t = 0;
        while(start<end)
        {
            t = nums[start];
            nums[start] = nums[end];
            nums[end] = t;
            start++;
            end--;
        }
    }
}
