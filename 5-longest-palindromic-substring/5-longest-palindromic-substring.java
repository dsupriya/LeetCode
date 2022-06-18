class Solution {
    public String longestPalindrome(String s) {
        int l,r,max;
        max = 0;
        int n = s.length();
        String answer = "";
        
        //i is the mid around which we will expand
        
        for(int i=0;i<n;i++)
        {
            //odd length
            String odd = getLongestPal(s,i,i);
            if(odd.length() > answer.length())
            {
                answer = odd;
            }
            String even = getLongestPal(s,i,i+1);
            if(even.length() > answer.length())
            {
                answer = even;
            }
            
        }
        return answer;
}
    
    public String getLongestPal(String s, int l, int r)
    {
        int left,right;
        int max = 0;
        int n = s.length();
        left=right=0;
        while(l>=0 && r<n && s.charAt(l)== s.charAt(r))
        {
            if(r-l+1 > max)
            {
                left = l;
                right = r;
                max = r-l+1;
            }
            l--;
            r++;
        }
        
        if(max == 0)
            return "";
        if(max == n)
            return s;
        else 
            return s.substring(left,right+1);
        
    }
}

// approch : expand around the center