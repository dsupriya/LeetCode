class Solution {
    public int balancedStringSplit(String s) {
        
        int n = s.length();
        int bal,ans;
        bal=ans=0;
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)=='L')
                bal++;
            else
                bal--;
            if(bal==0)
                ans++;
        }
        return ans;
        
    }
}
