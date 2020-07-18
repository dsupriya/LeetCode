class Solution {
    public int majorityElement(int[] nums) {
       /* HashMap <Integer, Integer> hm = new HashMap<Integer, Integer>();
        for(int i : nums)
        {
            if(hm.containsKey(i))
                hm.put(i, hm.get(i)+1);
            else
                hm.put(i,1);
        }
        int n = Math.floorDiv(nums.length,2);
        //System.out.println(n);
        int ans =0;
        for(Map.Entry<Integer,Integer> e : hm.entrySet())
        {
            if(e.getValue()>n)
            {
               ans= e.getKey();
                return ans;
            }
        }
        return ans;*/
        int count, ans;
        count=ans =0;
        for(int i : nums)
        {
            if(count ==0)
            {
                ans = i;
            }
            count = count +( (ans==i)?1:-1);
            
        }
        return ans;
        
    }
}
