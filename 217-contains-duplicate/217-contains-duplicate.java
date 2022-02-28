class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        HashSet <Integer> hs = new HashSet <Integer>();
        
        for(int n : nums)
        {
            if(hs.contains(n))
                return true;
            else
                hs.add(n);
        }
        return false;
        
        
    }
}