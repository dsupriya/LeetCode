class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
         //Arrays.copyOfRange(nums,l[i],r[i])
        int n = l.length;
        List<Boolean> res = new ArrayList();
        for(int i=0;i<n;i++)
        {
            int []next = Arrays.copyOfRange(nums,l[i],r[i]+1);
            res.add(isArithmetic(next));
        }
        return res;
        
    }
    public boolean isArithmetic(int []nums)
     {
         int n = nums.length;
         if(n<2)
             return false;
         if(n==2)
             return true;
         Arrays.sort(nums);
         for(int i=2;i<n;i++)
         {
             if(nums[i]-nums[i-1] != nums[i-1]-nums[i-2])
                 return false;
         }
        return true;
     }
    
}