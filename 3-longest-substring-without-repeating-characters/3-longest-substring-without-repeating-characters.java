class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n  = s.length();
        if(n==0 || n==1)
            return n;
        int start, end;
        start = 0;
        end = 0;
        HashSet <Character> hs = new HashSet();
        int max = 0;
        while(start<n && end <n)
        {
            char cur = s.charAt(end);
            if(!hs.contains(cur))
            {
                hs.add(cur);
                int cur_len = end-start+1;
                max = cur_len>max ? cur_len : max;
                end++;
                
            }
            else
            {
                hs.remove(s.charAt(start));
                start++;
            }
        }
        return max;
        
    }
}