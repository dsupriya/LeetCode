class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new LinkedList<List<Integer>>();
        int n = nums.length;
        Arrays.sort(nums);
        int x,y,z,sum;
        x=y=z=sum=0;
        for(int i=0;i<n && nums[i]<=0;i++)
        {
           
            if(i==0 || nums[i-1] != nums[i] )
            {
                twoSum(nums,i,ans);
            }
        }
            
        return ans;
        
    }
    public static void twoSum(int []nums, int x, List<List<Integer>> ans)
    {
        int l,r,sum;
        int n = nums.length;
        l = x+1;
        r = n-1;
        sum = 0 - nums[x];
         
    
        while(l<r)
            {
                if(nums[l]+nums[r]==sum)
                {
                    LinkedList <Integer> temp = new LinkedList<Integer>();
                    
                    temp.add(nums[x]);
                    temp.add(nums[l++]);
                    temp.add(nums[r--]);
                    ans.add(temp);
                    while (l < r && nums[l] == nums[l - 1])
                        ++l;
                    
                    
                    
                    
                }
                else if(nums[l]+nums[r]>sum)
                    r--;
                else
                    l++;
            }
    }
}