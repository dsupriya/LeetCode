class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        StringBuilder sb = new StringBuilder("");
        int count = strs.length;
        int len = strs[0].length();
        boolean isSame = false;
        
        for(int i=0;i<len;i++)
        {
            isSame = true;
            for(int j=0;j<count;j++)
            {
                if(i>= strs[j].length() || strs[0].charAt(i) != strs[j].charAt(i))
                {
                    isSame = false;
                    break;
                }
            }
            if(isSame)
                sb.append(strs[0].charAt(i));
            else
                break;
        }
        return new String(sb);
        
        
    }
}