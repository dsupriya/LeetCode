class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        HashSet <Character> hs = new HashSet <Character>();
        int i,j;
        i=j=0;
        int max = 0;
        while(i<n && j<n)
        {
            if(!hs.contains(s.charAt(j)))
            {
                hs.add(s.charAt(j));
                max = Math.max(max,j-i+1);
                j++;
            }
            else
            {
                hs.remove(s.charAt(i));
                i++;
            }
        }
        return max;
    }
}
