class Solution {
    public int numJewelsInStones(String j, String s) {
        int n = s.length();
        int ans=0;
        for(int i=0;i<n;i++)
        {
            char c = s.charAt(i);
            if(j.contains(c+""))
                ans++;
        }
        return ans;
    }
}
