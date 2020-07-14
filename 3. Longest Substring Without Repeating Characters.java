class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int ans=0;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<=n;j++)
            {
                if(isUnique(i,j,s))
                {
                    ans = Math.max(ans,j-i);
                }
            }
        }
        return ans;
    }
    public static boolean isUnique(int start, int e, String s)
    {
        HashSet <Character> hs = new HashSet <Character>();
        for(int i=start;i<e;i++)
        {
            Character c = s.charAt(i);
            if(hs.contains(c))
                return false;
            hs.add(c);
        }
        return true;
    }
}
