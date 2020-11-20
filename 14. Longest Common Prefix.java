class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder ans = new StringBuilder();
        int n = strs.length;
        if(n==0)
            return "";
        if(n==1)
            return strs[0];
        int m = strs[0].length();
        int j =0;
        for(int i=0;i<m;i++)
        {
            for(j=1;j<n && i<strs[j].length();j++)
            {
                if(strs[0].charAt(i)!=strs[j].charAt(i))
                    return new String(ans);
            }
            if(j==n)
                ans.append(strs[0].charAt(i));
        }
        return new  String(ans);
        
        
    }
}
