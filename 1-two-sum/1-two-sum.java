class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap <Integer,Integer> hm = new HashMap(); // Value , Place
        int n = nums.length;
        int [] ans = new int[2];
        
        for(int i=0;i<n;i++)
        {
            int rem = target - nums[i];
            if(hm.containsKey(rem))
            {
                ans [0] = hm.get(rem);
                ans [1] = i;
                break;
            }
            hm.put(nums[i],i);
        }
        return ans;
        
    }
}

/* There is hashmap solution
Space = o(n)
time = o(n)

With no space
sort = nlogn
space = o(1)

Brute Force
o(n2)

*/
