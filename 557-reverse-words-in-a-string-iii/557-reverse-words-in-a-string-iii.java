import java.util.*;
class Solution {
    public String reverseWords(String s) {
        String []str = s.split("\\s+");
        int n = str.length;
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n;i++)
        {
            sb = sb.append(reverse(str[i]));
            if(i!=n-1)
            {
                sb = sb.append(" ");
            }
        }
        return new String(sb);
        
        
    }
    
    public String reverse (String s)
    {
        char [] ch = s.toCharArray();
        int n = ch.length;
        int start = 0;
        int end = n-1;
        while(start < end)
        {
            char temp = ch[start];
            ch[start] = ch[end];
            ch[end] = temp; 
            start++;
            end--;
        }
        String ans = new String(ch);
        return ans;
    }
}