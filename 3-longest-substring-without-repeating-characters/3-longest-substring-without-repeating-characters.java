class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        HashMap <Character,Integer> hm = new HashMap();
        int n = s.length();
        int res = 0;
        
        for(int i=0,j=0; i<n && j<n ;j++)
        {
            char ch = s.charAt(j);
            if(hm.containsKey(ch))
            {
                int last_position = hm.get(ch);
                i = Math.max(last_position+1, i);
            }
            hm.put(ch,j);
            res = Math.max(res, j-i+1);
            
        }
        return res;
        
        
    }
}