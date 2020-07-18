class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
       int n = nums.length;
       int t =1; 
        for(int i =0;i<n;i++)
        {
            t = nums[i];
            t = Math.abs(t);
            t--;
            if(nums[t]>0)
                nums[t] = nums[t]*(-1);
        }
        LinkedList <Integer> ans = new LinkedList <Integer>();
        for(int i=0;i<n;i++)
        {
            if(nums[i]>0)
                ans.add(i+1);
        }
        return ans;
        
    }
}
