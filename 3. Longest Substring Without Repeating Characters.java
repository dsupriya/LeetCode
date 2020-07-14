//Brute force - n^3
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
//optimal o(n)
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        HashMap <Character, Integer> hm= new HashMap <Character, Integer>();
        int ans =0;
        for(int i=0,j=0;i<n&&j<n;j++)
        {
            char c = s.charAt(j);
            if(hm.containsKey(c))
            {
                i = Math.max(hm.get(s.charAt(j)),i);
            }
            ans = Math.max(ans,j-i+1);
            hm.put(c,j+1);
            
        }
        return ans;
}
}
