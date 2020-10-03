import java.util.*;
class Solution {
    public int romanToInt(String s) {
        HashMap <String,Integer>hm = new HashMap<String,Integer>();
        hm.put("I",new Integer (1));
        hm.put("V",new Integer (5));
        hm.put("X",new Integer (10));
        hm.put("L",new Integer (50));
        hm.put("C",new Integer (100));
        hm.put("D",new Integer (500));
        hm.put("M",1000);
        hm.put("IV",4);
        hm.put("IX",9);
        hm.put("XL",40);
        hm.put("XC",90);
        hm.put("CD",400);
        hm.put("CM",900);
        int n = s.length();
        int ans = 0;
        String key = "";
        for(int i=0;i<n;)
        {
            if(i+1<n)
                 key = ""+s.charAt(i)+s.charAt(i+1);
            else
                key = ""+s.charAt(i);
                
            if(hm.containsKey(key))
            {
                ans = ans+ hm.get(key);
                i=i+2;
            }
            else
            {
                ans = ans+hm.get(""+s.charAt(i));
                i++;
            }
        }
        return ans;
    }
}
