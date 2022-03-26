import java.util.*;
class Solution {
    public int longestPalindrome(String s) {
        HashMap <Character,Integer> hm = new HashMap();
        
        for(int i=0;i<s.length();i++)
        {
            char c = s.charAt(i);
            int count = hm.getOrDefault(c,0);
            hm.put(c,count+1);
        }
        int ans = 0;
        boolean foundOdd = false;
        for(Map.Entry <Character,Integer> e : hm.entrySet())
        {
            if(e.getValue()%2==0)
            {
                ans = ans+e.getValue();
            }
            else
            {
                ans = ans+e.getValue()-1;
                foundOdd = true;
                
            }
        }
        if(foundOdd)
            ans = ans+1;
        return ans;
        
    }
}